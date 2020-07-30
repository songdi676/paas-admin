package nl.sri.zentao.controller;

import com.baomidou.dynamic.datasource.annotation.DS;

import lombok.RequiredArgsConstructor;
import nl.sri.zentao.mapper.ZtProjectMapper;
import nl.sri.zentao.service.IZtTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 禅道任务rest
 */
@Controller
@RequestMapping("/zentao/task")
@RequiredArgsConstructor
@DS("#header.DataSource")
public class TaskController {

    private final IZtTaskService ztTaskService;

}
