package nl.sri.zentao.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ZtDept;
import nl.sri.zentao.entity.vo.UserWorkInfo;
import nl.sri.zentao.service.impl.ZtDeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 部门
 */
@Controller
@RequestMapping("/zentao/dept")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class ZtDeptController {

    @Autowired
    private ZtDeptServiceImpl ztDeptService;
    @Autowired
    private ZtUserController ztUserController;

    @GetMapping("/project/{id}")
    @ResponseBody
    public List<ZtDept> getZtDept(@PathVariable("id") Integer projectId) {
        UserWorkInfo userWorkInfo = new UserWorkInfo();
        userWorkInfo.setProject(projectId);
        List<UserWorkInfo> userWorkInfos = ztUserController.getWorkInfo(userWorkInfo);
        List<Integer> deptIds = userWorkInfos.stream().map(UserWorkInfo::getDept).collect(Collectors.toList());
        List<ZtDept> ztDeptList = ztDeptService.list(Wrappers.<ZtDept>query().in("id", deptIds));
        return ztDeptList;
    }
}
