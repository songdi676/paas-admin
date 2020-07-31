package nl.sri.sonar.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import nl.sri.sonar.entity.ProjectMeasures;
import nl.sri.sonar.entity.Projects;
import nl.sri.sonar.service.IProjectMeasuresService;
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
@RequestMapping("/sonar/project-measures")
public class ProjectMeasuresController {

    private final IProjectMeasuresService projectMeasuresService;

    @ApiOperation("查询projectsMeasures")
    @GetMapping(value = "")
    public ResponseEntity<List<ProjectMeasures>> list(ProjectMeasures projectMeasures,
        Page<ProjectMeasures> page) {
        List<ProjectMeasures> list = projectMeasuresService.list(Wrappers.<ProjectMeasures>query(projectMeasures));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @ApiOperation("查询项目指标：实时，较昨日，较上迭代")
    @GetMapping(value = "/data-box/project/{id}")
    public ResponseEntity<List<ProjectMeasures>> queryProjectsMeasures(ProjectMeasures projectMeasures,
        Page<ProjectMeasures> page) {
        List<ProjectMeasures> list = projectMeasuresService.list(Wrappers.<ProjectMeasures>query(projectMeasures));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
