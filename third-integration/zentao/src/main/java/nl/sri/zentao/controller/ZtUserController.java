package nl.sri.zentao.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ResponseVo;
import nl.sri.zentao.entity.ZtBug;
import nl.sri.zentao.entity.ZtBurn;
import nl.sri.zentao.entity.ZtBurnDept;
import nl.sri.zentao.entity.ZtTask;
import nl.sri.zentao.entity.ZtUser;
import nl.sri.zentao.entity.vo.PieDataBaseList;
import nl.sri.zentao.entity.vo.UserWorkInfo;
import nl.sri.zentao.entity.vo.ZtBurnDeptVo;
import nl.sri.zentao.service.impl.ZtBugServiceImpl;
import nl.sri.zentao.service.impl.ZtBurnDeptServiceImpl;
import nl.sri.zentao.service.impl.ZtBurnServiceImpl;
import nl.sri.zentao.service.impl.ZtTaskServiceImpl;
import nl.sri.zentao.service.impl.ZtUserServiceImpl;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.util.stream.Collectors.toList;

/**
 * 禅道燃净图rest
 */
@Controller
@RequestMapping("/zentao/user")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class ZtUserController {

    @Autowired
    private ZtBugServiceImpl ztBugServiceImpl;
    @Autowired
    private ZtTaskServiceImpl ztTaskServiceImpl;
    @Autowired
    private ZtUserServiceImpl ztUserServiceImpl;
    private static final Map<String, Function<? super UserWorkInfo, Object>> legendMap = new HashMap<>();

    static {
        legendMap.put("总工时", UserWorkInfo::getTotalManHour);
        legendMap.put("已消耗工时", UserWorkInfo::getExpendManHour);
        legendMap.put("剩余工时", UserWorkInfo::getLeftManHour);
        legendMap.put("Bug数", UserWorkInfo::getBugs);
        legendMap.put("已解决Bug数", UserWorkInfo::getResolveBugs);
        legendMap.put("任务数", UserWorkInfo::getTasks);
        legendMap.put("已完成任务数", UserWorkInfo::getFinishedTasks);
    }


    @GetMapping("/chart")
    @ResponseBody
    public Map<String, Object> getChart(UserWorkInfo userWorkInfo, String category) {
        List<UserWorkInfo> userWorkInfoList = getWorkInfo(userWorkInfo);
        List<String> xAxis = userWorkInfoList.stream().map(UserWorkInfo::getRealname).collect(Collectors.toList());
        Integer maxHour = userWorkInfoList.stream().map(UserWorkInfo::getTotalManHour).max(Integer::compareTo).get();
        List<PieDataBaseList> series = new ArrayList<>();
        List<String> legendList = legendMap.keySet().stream().filter(s -> s.contains(category)).collect(toList());
        for (String legend : legendList) {
            PieDataBaseList pieDataBaseList = new PieDataBaseList();
            pieDataBaseList.setName(legend);
            pieDataBaseList.setType("bar");
            pieDataBaseList.setStack(null);
            pieDataBaseList.setBarWidth(20);
            for (UserWorkInfo u : userWorkInfoList) {
                pieDataBaseList.addData(legendMap.get(legend).apply(u));
            }
            series.add(pieDataBaseList);
        }

        Map<String, Object> result = new HashMap<>();
        result.put("legend", legendList);
        result.put("xAxis", xAxis);
        result.put("series", series);

        return result;
    }

    @GetMapping("/work-info")
    @ResponseBody
    public List<UserWorkInfo> getWorkInfo(UserWorkInfo userWorkInfo) {
        ZtBug ztBug = new ZtBug();
        ztBug.setProject(userWorkInfo.getProject());
        List<ZtBug> bugs = ztBugServiceImpl.list(Wrappers.query(ztBug));
        ZtTask ztTask = new ZtTask();
        ztTask.setProject(userWorkInfo.getProject());
        List<ZtTask> tasks = ztTaskServiceImpl.list(Wrappers.query(ztTask));
        List<UserWorkInfo> userWorkInfoList = new ArrayList<>();
        Set<String> allUser = new HashSet<>();
        //根据分配人员分组
        Map<String, List<ZtBug>> assignedBugs = bugs.stream().collect(Collectors.groupingBy(ZtBug::getAssignedTo));
        allUser.addAll(assignedBugs.keySet());
        //根据解决人员分组
        Map<String, List<ZtBug>> resolvedBugs = bugs.stream().collect(Collectors.groupingBy(ZtBug::getResolvedBy));
        allUser.addAll(resolvedBugs.keySet());
        //根据分配人员分组
        Map<String, List<ZtTask>> assignedTasks = tasks.stream().collect(Collectors.groupingBy(ZtTask::getAssignedTo));
        allUser.addAll(assignedTasks.keySet());

        //根据解决人员分组
        Map<String, List<ZtTask>> finishedTasks = tasks.stream().collect(Collectors.groupingBy(ZtTask::getFinishedBy));
        allUser.addAll(finishedTasks.keySet());
        Map<String, Integer> estimateMap = collectTaskTime(assignedTasks, finishedTasks, ZtTask::getEstimate);
        Map<String, Integer> consumedMap = collectTaskTime(assignedTasks, finishedTasks, ZtTask::getConsumed);
        Map<String, Integer> leftMap = collectTaskTime(assignedTasks, finishedTasks, ZtTask::getLeft);

        List<ZtUser> userList =
            ztUserServiceImpl.list(Wrappers.<ZtUser>query().in("account", allUser.stream().collect(toList())));
        for (ZtUser user : userList) {
            UserWorkInfo userWorkInfoTemp = new UserWorkInfo();
            BeanUtils.copyProperties(user, userWorkInfoTemp);
            userWorkInfoTemp.setBugs(assignedBugs.getOrDefault(user.getAccount(), Collections.emptyList()).size());
            userWorkInfoTemp
                .setResolveBugs(resolvedBugs.getOrDefault(user.getAccount(), Collections.emptyList()).size());
            userWorkInfoTemp.setTotalManHour(estimateMap.getOrDefault(user.getAccount(), 0));
            userWorkInfoTemp.setExpendManHour(consumedMap.getOrDefault(user.getAccount(), 0));
            userWorkInfoTemp.setLeftManHour(leftMap.getOrDefault(user.getAccount(), 0));
            userWorkInfoTemp.setTasks(assignedTasks.getOrDefault(user.getAccount(), Collections.emptyList()).size());
            userWorkInfoTemp
                .setFinishedTasks(finishedTasks.getOrDefault(user.getAccount(), Collections.emptyList()).size());
            userWorkInfoList.add(userWorkInfoTemp);

        }
        return userWorkInfoList;
    }

    private Map<String, Integer> collectTaskTime(Map<String, List<ZtTask>> tasks,
        Map<String, List<ZtTask>> finishedTasks, Function<? super ZtTask, Float> classifier) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<ZtTask>> e : tasks.entrySet()) {
            Float sum = e.getValue().stream().map(classifier).reduce(Float::sum).get();
            result.put(e.getKey(), sum.intValue());
        }
        for (Map.Entry<String, List<ZtTask>> e : finishedTasks.entrySet()) {
            Float sum = e.getValue().stream().map(classifier).reduce(Float::sum).get();
            if (result.containsKey(e.getKey())) {
                sum += result.get(e.getKey());
                result.put(e.getKey(), sum.intValue());
            } else {
                result.put(e.getKey(), sum.intValue());
            }
        }
        return result;
    }
}
