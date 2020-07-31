package nl.sri.zentao.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.ResponseVo;
import nl.sri.zentao.entity.vo.PieDataBase;
import nl.sri.zentao.entity.vo.PieDataBaseList;
import nl.sri.zentao.entity.vo.ZtBurnDeptVo;
import nl.sri.zentao.service.impl.ZtBurnDeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/getZtBurnDept/{project}")
    @ResponseBody
    public ResponseVo<Map<String, Object>> getZtBurnDept(@PathVariable("project") String project) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        Map<String, Object> result = new HashMap<>();
        List<ZtBurnDeptVo> ztBurnDepts = ztBurnDeptService.getZtBurnDept(project);
        List<String> legend = new ArrayList<>();
        List<String> xAxis = new ArrayList<>();
        List<PieDataBaseList> series = new ArrayList<>();
        for (ZtBurnDeptVo ztBurnDeptVo : ztBurnDepts) {
            if (!xAxis.contains(ztBurnDeptVo.getTime())) {
                xAxis.add(ztBurnDeptVo.getTime());
            }
            if (!legend.contains(ztBurnDeptVo.getMetric())) {
                legend.add(ztBurnDeptVo.getMetric());
            }
        }
        for (String group : legend) {
            PieDataBaseList pieDataBaseList=new PieDataBaseList();
            pieDataBaseList.setName(group);
            List<String> data = new ArrayList<>();
            for (String time : xAxis){
                boolean isExits = false;
                for (ZtBurnDeptVo ztBurnDeptVo : ztBurnDepts) {
                    if (ztBurnDeptVo.getMetric().equals(group) && ztBurnDeptVo.getTime().equals(time)){
                        isExits = true;
                        data.add(ztBurnDeptVo.getValue());
                    }
                }
                if (!isExits){
                    data.add("0");
                }
            }
            pieDataBaseList.setData(data);
            series.add(pieDataBaseList);
        }
        result.put("legend", legend);
        result.put("xAxis", xAxis);
        result.put("series", series);
        responseVo.setContent(result);
        return responseVo;
    }
}
