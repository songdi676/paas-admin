package nl.sri.zentao.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.vo.DataBoxVo;
import nl.sri.zentao.entity.ResponseVo;
import nl.sri.zentao.entity.ZtBug;
import nl.sri.zentao.entity.vo.PieDataBase;
import nl.sri.zentao.service.IZtBugService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 禅道任务rest
 */
@Controller
@RequestMapping("/zentao/bug")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class BugController {

    private final IZtBugService ztBugService;
    private static final Map<Object, String> bugStatusMap = new HashMap<>();
    private static final Map<String, Function<ZtBug, Object>> bugCategoryMap = new HashMap<>();

    static {
        bugCategoryMap.put("status", ZtBug::getStatus);
        bugCategoryMap.put("type", ZtBug::getType);
        bugCategoryMap.put("severit", ZtBug::getSeverity);
        bugStatusMap.put("resolved", "解决");
        bugStatusMap.put("closed", "关闭");
        bugStatusMap.put("active", "激活");

        bugStatusMap.put("interface", "接口");
        bugStatusMap.put("codeerror", "编码");
        bugStatusMap.put("others", "其他");
        bugStatusMap.put("config", "配置");
        bugStatusMap.put("security", "安全");
        bugStatusMap.put("install", "安装");
        bugStatusMap.put("trackthings", "trackthings");
        bugStatusMap.put("designdefect", "设计");
        bugStatusMap.put("standard", "标准");
        bugStatusMap.put("automation", "自动化");
        bugStatusMap.put("newfeature", "新特性");
        bugStatusMap.put("performance", "性能");

        bugStatusMap.put(4, "紧急");
        bugStatusMap.put(3, "急");
        bugStatusMap.put(2, "中");
        bugStatusMap.put(1, "低");

    }

    /**
     * 获取迭代里任务列表
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<ZtBug>> getZtBugInfo(ZtBug ztBug) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtBug> statusInfo = ztBugService.list(Wrappers.<ZtBug>query(ztBug));
        return new ResponseEntity<>(statusInfo, HttpStatus.OK);
    }

    @GetMapping("/status")
    @ResponseBody
    public ResponseEntity<Map<String, Long>> getZtBugstatus(ZtBug ztBug) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtBug> statusInfo = ztBugService.list(Wrappers.<ZtBug>query(ztBug));
        Map<String, Long> ss =
            statusInfo.stream().collect(Collectors.groupingBy(ZtBug::getStatus, Collectors.counting()));
        ss.put("all", Long.valueOf(statusInfo.size()));
        return new ResponseEntity<>(ss, HttpStatus.OK);
    }

    @GetMapping("/daily-char")
    @ResponseBody
    public ResponseEntity<Map<LocalDateTime, Long>> getZtBugDaily(ZtBug ztBug) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtBug> statusInfo = ztBugService.list(Wrappers.<ZtBug>query(ztBug));
        Map<LocalDateTime, Long> add =
            statusInfo.stream().collect(Collectors.groupingBy(ZtBug::getOpenedDate, Collectors.counting()));
        Map<LocalDateTime, Long> ss =
            statusInfo.stream().collect(Collectors.groupingBy(ZtBug::getClosedDate, Collectors.counting()));
       // ss.put("all", Long.valueOf(statusInfo.size()));
        return new ResponseEntity<>(ss, HttpStatus.OK);
    }

    @GetMapping("/pie-char")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getZtBugPieChar(ZtBug ztBug, String category) {
        List<ZtBug> statusInfo = ztBugService.list(Wrappers.<ZtBug>query(ztBug));
        Map<Object, Long> ss =
            statusInfo.stream().collect(Collectors.groupingBy(bugCategoryMap.get(category), Collectors.counting()));
        List<PieDataBase> pieDataBaseList = new ArrayList<>();
        List<String> legend = new ArrayList<>();
        ss.forEach((k, v) -> {
            String name=bugStatusMap.getOrDefault(k,"未知");
            legend.add(name);
            PieDataBase pieDataBase = new PieDataBase(name, v);
            pieDataBaseList.add(pieDataBase);
        });
        Map<String, Object> result=new HashMap<>();
        result.put("legend", legend);
        result.put("series", pieDataBaseList);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/data-box")
    @ResponseBody
    public ResponseEntity<DataBoxVo> getZtBugDataBox(ZtBug ztBug) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtBug> statusInfo = ztBugService.list(Wrappers.<ZtBug>query(ztBug));
        Map<String, Long> statusMap =
            statusInfo.stream().collect(Collectors.groupingBy(ZtBug::getStatus, Collectors.counting()));
        DataBoxVo dataBoxVo = new DataBoxVo("禅道Bug", statusInfo.size(), statusMap);

        return new ResponseEntity<>(dataBoxVo, HttpStatus.OK);
    }
}
