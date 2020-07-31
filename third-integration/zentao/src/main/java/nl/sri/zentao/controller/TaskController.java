package nl.sri.zentao.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.vo.DataBoxVo;
import nl.sri.zentao.entity.ResponseVo;
import nl.sri.zentao.entity.ZtTask;
import nl.sri.zentao.service.IZtTaskService;
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
@RequestMapping("/zentao/task")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class TaskController {

    private final IZtTaskService ztTaskService;

    /**
     * 获取迭代里任务列表
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<ZtTask>> getZtTaskInfo(ZtTask ztTask) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtTask> statusInfo = ztTaskService.list(Wrappers.<ZtTask>query(ztTask));
        return new ResponseEntity<>(statusInfo, HttpStatus.OK);
    }

    @GetMapping("/status")
    @ResponseBody
    public ResponseEntity<Map<String, Long>> getZtTaskstatus(ZtTask ztTask) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtTask> statusInfo = ztTaskService.list(Wrappers.<ZtTask>query(ztTask));
        Map<String, Long> ss =
            statusInfo.stream().collect(Collectors.groupingBy(ZtTask::getStatus, Collectors.counting()));
        ss.put("all", Long.valueOf(statusInfo.size()));
        return new ResponseEntity<>(ss, HttpStatus.OK);
    }

    @GetMapping("/data-box")
    @ResponseBody
    public ResponseEntity<DataBoxVo> getZtBugDataBox(ZtTask ztTask) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        List<ZtTask> statusInfo = ztTaskService.list(Wrappers.<ZtTask>query(ztTask));
        Map<String, Long> statusMap =
            statusInfo.stream().collect(Collectors.groupingBy(ZtTask::getStatus, Collectors.counting()));
        DataBoxVo dataBoxVo = new DataBoxVo("禅道任务", statusInfo.size(), statusMap);

        return new ResponseEntity<>(dataBoxVo, HttpStatus.OK);
    }
}
