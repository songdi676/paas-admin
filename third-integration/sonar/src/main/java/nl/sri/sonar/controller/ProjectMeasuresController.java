package nl.sri.sonar.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import nl.sri.sonar.entity.LiveMeasures;
import nl.sri.sonar.entity.Metrics;
import nl.sri.sonar.entity.ProjectMeasures;
import nl.sri.sonar.entity.Projects;
import nl.sri.sonar.entity.Snapshots;
import nl.sri.sonar.service.ILiveMeasuresService;
import nl.sri.sonar.service.IMetricsService;
import nl.sri.sonar.service.IProjectMeasuresService;
import nl.sri.sonar.service.IProjectsService;
import nl.sri.sonar.service.ISnapshotsService;
import nl.sri.sonar.service.impl.ProjectMeasuresServiceImpl;
import nl.sri.vo.DataBoxVo;
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
    private final ISnapshotsService snapshotsService;
    private final ILiveMeasuresService liveMeasuresService;
    private final IMetricsService metricsService;

    @ApiOperation("查询projectsMeasures")
    @GetMapping(value = "")
    public ResponseEntity<List<ProjectMeasures>> list(ProjectMeasures projectMeasures, Page<ProjectMeasures> page) {
        List<ProjectMeasures> list = projectMeasuresService.list(Wrappers.<ProjectMeasures>query(projectMeasures));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @ApiOperation("查询项目指标：实时，较昨日，较上迭代")
    @GetMapping(value = "/data-boxes")
    public ResponseEntity<List<DataBoxVo>> queryProjectsMeasures(ProjectMeasures projectMeasures) {
        // 获取最新构建快照
        LiveMeasures liveMeasures = new LiveMeasures();
        liveMeasures.setComponentUuid(projectMeasures.getComponentUuid());
        List<LiveMeasures> liveMeasureist = liveMeasuresService.list(Wrappers.<LiveMeasures>query(liveMeasures));

        Snapshots snapshots = new Snapshots();
        snapshots.setComponentUuid(projectMeasures.getComponentUuid());

        // 获取最新指标
        List<ProjectMeasures> newList = null;
        Snapshots lastSnapshots = snapshotsService.getLast(snapshots);
        if (lastSnapshots != null) {
            projectMeasures.setAnalysisUuid(lastSnapshots.getUuid());
            newList = projectMeasuresService.list(Wrappers.<ProjectMeasures>query(projectMeasures));
        }

        // 获取昨天指标
        List<ProjectMeasures> yesterdayList = null;
        Snapshots snapshots2 = new Snapshots();
        snapshots2.setComponentUuid(projectMeasures.getComponentUuid());
        Snapshots yesterdaySnapshots = snapshotsService.getYesterdayLast(snapshots2);
        if (yesterdaySnapshots != null) {
            projectMeasures.setAnalysisUuid(yesterdaySnapshots.getUuid());
            yesterdayList = projectMeasuresService.list(Wrappers.<ProjectMeasures>query(projectMeasures));
        }
        // 获取上次基线版本
        List<ProjectMeasures> thirtyList = null;
        snapshots2.setComponentUuid(projectMeasures.getComponentUuid());
        snapshots2.setVersion("base");
        Snapshots thirtySnapshots = snapshotsService.getLast2(snapshots2);
        if (thirtySnapshots != null) {
            projectMeasures.setAnalysisUuid(thirtySnapshots.getUuid());
            thirtyList = projectMeasuresService.list(Wrappers.<ProjectMeasures>query(projectMeasures));
        }
        Map<Integer, Metrics> metricsMap = metricsService.getMetricsMap();
        List<DataBoxVo> ss =
            ProjectMeasuresServiceImpl.getMeasuresChange(newList, yesterdayList, thirtyList, metricsMap);

        return new ResponseEntity<>(ss, HttpStatus.OK);
    }
}
