package nl.sri.sonar.controller;

import java.util.List;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import nl.sri.sonar.entity.Projects;
import nl.sri.sonar.entity.Snapshots;
import nl.sri.sonar.service.IProjectsService;
import nl.sri.sonar.service.ISnapshotsService;
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
@RequestMapping("/sonar/snapshots")
public class SnapshotsController {
    private final ISnapshotsService snapshotsService;

    @ApiOperation("查询snapshots")
    @GetMapping(value = "")
    public ResponseEntity<List<Snapshots>> list(Snapshots snapshots) {
        List<Snapshots> list = snapshotsService.list(Wrappers.<Snapshots>query(snapshots));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
