package nl.sri.zentao.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ResponseVo;
import nl.sri.zentao.service.impl.ZtBurnDeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 禅道燃净图rest
 */
@Controller
@RequestMapping("/zentao/burnDept")
@RequiredArgsConstructor
@DS("#header.zentaoDataSource")
public class ZtBurnDeptController {

    @Autowired
    private ZtBurnDeptServiceImpl ztBurnDeptService;

    @GetMapping("/getZtBugDataBox/{project}")
    @ResponseBody
    public ResponseVo<Map<String,Object>> getZtBugDataBox(@PathVariable("project")String project) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        responseVo.setContent(ztBurnDeptService.getZtBurnDept(project));
        return responseVo;
    }
}
