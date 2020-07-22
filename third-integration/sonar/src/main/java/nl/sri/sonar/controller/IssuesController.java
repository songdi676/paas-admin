package nl.sri.sonar.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.zhengjie.utils.SecurityUtils;
import nl.sri.sonar.entity.Issues;
import nl.sri.sonar.service.IIssuesService;
import org.apache.poi.ss.formula.functions.T;
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
 * @since 2020-07-15
 */
@Controller
@RequestMapping("/sonar/issues")
@RequiredArgsConstructor
public class IssuesController {
    private final IIssuesService issuesService;

    @ApiOperation("查询issues")
    @GetMapping(value = "")
    public ResponseEntity<Object> queryIssues(Issues issues, Page<Issues> ss) {
        //测试提交
        String userName = SecurityUtils.getCurrentUsername();
        return new ResponseEntity<>(issuesService.page(ss, Wrappers.<Issues>query(issues).eq("author_login", userName)),
            HttpStatus.OK);
    }
}
