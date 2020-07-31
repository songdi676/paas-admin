package nl.sri.sonar.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.zhengjie.utils.SecurityUtils;
import nl.sri.sonar.entity.Issues;
import nl.sri.sonar.entity.Projects;
import nl.sri.sonar.service.IProjectsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author songdi
 * @since 2020-07-31
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/sonar/projects")
public class ProjectsController {

    private final IProjectsService projectsService;

    @ApiOperation("查询projects")
    @GetMapping(value = "")
    public ResponseEntity<List<Projects>> list(Projects projects, Page<Projects> page) {
        List<Projects> list = projectsService.list(Wrappers.<Projects>query(projects));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
