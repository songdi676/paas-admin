package nl.sri.zentao.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ZtDept;
import nl.sri.zentao.entity.vo.DeptTaskEstime;
import nl.sri.zentao.entity.vo.PieDataBaseList;
import nl.sri.zentao.entity.vo.UserWorkInfo;
import nl.sri.zentao.mapper.ZtTaskestimateMapper;
import nl.sri.zentao.service.impl.ZtDeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.util.stream.Collectors.toList;

/**
 * 部门
 */
@Controller
@RequestMapping("/zentao/task-estimate")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class ZtTaskestimateController {

    @Autowired
    private ZtTaskestimateMapper ztTaskestimateMapper;

    @GetMapping("/project/{id}")
    @ResponseBody
    public Map<String, Object> getZtDept(@PathVariable("id") Integer projectId) {
        List<DeptTaskEstime> deptTaskEstimes = ztTaskestimateMapper.getTaskEstimeByProject(projectId);
        Map<String, List<DeptTaskEstime>> deptTaskMap =
            deptTaskEstimes.stream().collect(Collectors.groupingBy(DeptTaskEstime::getDeptName));
        Map<String, Collection<DeptTaskEstime>> result = new HashMap<>();
        //遍历部门的时间消耗
        Set<String> xAxis = new HashSet<>();
        for (Map.Entry<String, List<DeptTaskEstime>> e : deptTaskMap.entrySet()) {
            Map<LocalDate, DeptTaskEstime> re = new HashMap<>();
            //按时间分组，聚合
            Map<LocalDate, List<DeptTaskEstime>> sss =
                e.getValue().stream().collect(Collectors.groupingBy(DeptTaskEstime::getDate));
            xAxis.addAll(sss.keySet().stream().map(LocalDate::toString).collect(Collectors.toSet()));
            for (Map.Entry<LocalDate, List<DeptTaskEstime>> e2 : sss.entrySet()) {
                Optional<DeptTaskEstime> ss = e2.getValue().stream().reduce(DeptTaskEstime::sum);
                if (ss.isPresent()) {
                    re.put(ss.get().getDate(), ss.get());
                }

            }
            result.put(e.getKey(), re.values());
        }
        List<String> xAxisList=xAxis.stream().sorted().collect(toList());

        List<PieDataBaseList> series = new ArrayList<>();
        for (Map.Entry<String, Collection<DeptTaskEstime>> e : result.entrySet()) {
            PieDataBaseList pieDataBaseList = new PieDataBaseList();
            pieDataBaseList.setName(e.getKey());
            pieDataBaseList.setType("line");
            pieDataBaseList.setStack(null);
            pieDataBaseList.setBarWidth(20);
            Map<String, DeptTaskEstime> sda =
                e.getValue().stream().collect(Collectors.toMap(a->a.getDate().toString(), a -> a));
            for (String  date : xAxisList) {
                pieDataBaseList.addData(sda.getOrDefault(date,new DeptTaskEstime()).getConsumed());
            }
            series.add(pieDataBaseList);
        }
        List<String> legendList = deptTaskMap.keySet().stream().collect(toList());
        Map<String, Object> resultq = new HashMap<>();
        resultq.put("legend", legendList);
        resultq.put("xAxis", xAxisList
        );
        resultq.put("series", series);

        return resultq;
    }
}
