package nl.sri.zentao.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ResponseVo;
import nl.sri.zentao.entity.ZtBurn;
import nl.sri.zentao.entity.ZtBurnDept;
import nl.sri.zentao.entity.vo.PieDataBase;
import nl.sri.zentao.entity.vo.PieDataBaseList;
import nl.sri.zentao.entity.vo.ZtBurnDeptVo;
import nl.sri.zentao.service.impl.ZtBurnDeptServiceImpl;
import nl.sri.zentao.service.impl.ZtBurnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Wrapper;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    @Autowired
    private ZtBurnServiceImpl ztBurnService;

    @GetMapping("/line-chart")
    @ResponseBody
    public ResponseVo<Map<String, Object>> getZtBurnDept(ZtBurnDept ztBurnDept) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        Map<String, Object> result = new HashMap<>();
        ZtBurn ztBurn = new ZtBurn();
        ztBurn.setProject(ztBurnDept.getProject());
        List<ZtBurn> ztBurnList = ztBurnService.list(Wrappers.<ZtBurn>query(ztBurn));
        List<ZtBurnDeptVo> ztBurnDepts = ztBurnDeptService.getZtBurnDept(ztBurnDept.getProject());
        List<String> legend =
            ztBurnList.stream().map(z -> z.getProject().toString()).distinct().collect(Collectors.toList());
        List<String> xAxis =
            ztBurnList.stream().map(ZtBurn::getDate).map(LocalDate::toString).collect(Collectors.toList());
        List<Object> data = ztBurnList.stream().map(z -> z.getLeft().toString()).collect(Collectors.toList());
        List<PieDataBaseList> series = new ArrayList<>();

        for (String group : legend) {
            PieDataBaseList pieDataBaseList = new PieDataBaseList();
            pieDataBaseList.setName(group);
            pieDataBaseList.setData(data);
            series.add(pieDataBaseList);
        }
        //result.put("legend", legend);
        result.put("xAxis", xAxis);
        result.put("series", series);
        responseVo.setContent(result);
        return responseVo;
    }
}
