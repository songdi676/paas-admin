package nl.sri.zentao.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ZtBug;
import nl.sri.zentao.entity.ZtTask;
import nl.sri.zentao.entity.ZtUser;
import nl.sri.zentao.entity.vo.PieDataBaseList;
import nl.sri.zentao.entity.vo.UserWorkInfo;
import nl.sri.zentao.service.impl.ZtBugServiceImpl;
import nl.sri.zentao.service.impl.ZtTaskServiceImpl;
import nl.sri.zentao.service.impl.ZtUserServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.util.stream.Collectors.toList;

/**
 * 禅道燃净图rest
 */
@Controller
@RequestMapping("/zentao/overview")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class ZtOverviewController {

    @Autowired
    private ZtBugServiceImpl ztBugServiceImpl;
    @Autowired
    private ZtTaskServiceImpl ztTaskServiceImpl;
    @Autowired
    private ZtUserServiceImpl ztUserServiceImpl;

    @GetMapping("/project/{id}")
    @ResponseBody
    public Map<String, Object> getChart(@PathVariable("id") Integer projectId) {
        return null;
    }

}
