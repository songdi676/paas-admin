package nl.sri.sonar.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import nl.sri.sonar.controller.IssuesController;
import nl.sri.sonar.entity.Metrics;
import nl.sri.sonar.entity.ProjectMeasures;
import nl.sri.sonar.mapper.ProjectMeasuresMapper;
import nl.sri.sonar.service.IMetricsService;
import nl.sri.sonar.service.IProjectMeasuresService;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import nl.sri.sonar.service.IProjectsService;
import nl.sri.vo.DataBoxVo;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author songdi
 * @since 2020-07-31
 */
@Service
@Primary
@DS("#header.sonarDataSource")
public class ProjectMeasuresServiceImpl extends ServiceImpl<ProjectMeasuresMapper, ProjectMeasures>
    implements IProjectMeasuresService {
    //需要比较的指标
    private static final Map<Integer, String> COMPARE_MEASURES = new HashMap<>();

    static {
        //COMPARE_MEASURES.put(38, "lines_to_cover");
        //COMPARE_MEASURES.put(40, "uncovered_lines");
        //COMPARE_MEASURES.put(127, "reliability_remediation_effort");
        COMPARE_MEASURES.put(1, "代码行");
        // COMPARE_MEASURES.put(45, "conditions_to_cover");
        // COMPARE_MEASURES.put(47, "uncovered_conditions");
        //COMPARE_MEASURES.put(89, "duplicated_blocks");
        //COMPARE_MEASURES.put(95, "violations");
        COMPARE_MEASURES.put(92, "重复率");
        COMPARE_MEASURES.put(36, "单元测试覆盖率");
        COMPARE_MEASURES.put(19, "圈复杂度");
        //COMPARE_MEASURES.put(97, "critical_violations");
        //COMPARE_MEASURES.put(116, "vulnerabilities");
        //COMPARE_MEASURES.put(206, "security_hotspots");
        //COMPARE_MEASURES.put(122, "development_cost");
        //COMPARE_MEASURES.put(124, "sqale_debt_ratio");
        //COMPARE_MEASURES.put(98, "major_violations");
        //COMPARE_MEASURES.put(99, "minor_violations");
        //COMPARE_MEASURES.put(100, "info_violations");
        COMPARE_MEASURES.put(112, "异味");
        COMPARE_MEASURES.put(114, "BUG");
        //COMPARE_MEASURES.put(129, "reliability_rating");
        //COMPARE_MEASURES.put(131, "security_remediation_effort");
        //COMPARE_MEASURES.put(133, "security_rating");
    }

    public static List<DataBoxVo> getMeasuresChange(List<ProjectMeasures> projectMeasures,
        List<ProjectMeasures> oldProjectMeasures, List<ProjectMeasures> oldProjectMeasures2,
        Map<Integer, Metrics> metricsMap) {
        Map<Integer, BigDecimal> map = getMap(projectMeasures);

        Map<Integer, BigDecimal> oldmap = null;
        if (oldProjectMeasures != null) {
            oldmap = getMap(oldProjectMeasures);
        }

        Map<Integer, BigDecimal> oldmap2 = null;
        if (oldProjectMeasures2 != null) {
            oldmap2 = getMap(oldProjectMeasures2);
        }

        DecimalFormat df4 = new DecimalFormat();
        // #：位置上无数字不显示
        df4.applyPattern("#.##");

        List<DataBoxVo> dataBoxVoList = new ArrayList<>();
        for (Map.Entry<Integer, BigDecimal> entry : map.entrySet()) {
            Integer k = entry.getKey();
            BigDecimal v = entry.getValue();
            if (!COMPARE_MEASURES.containsKey(k)) {
                continue;
            }
            Metrics metric = metricsMap.get(k);
            DataBoxVo dataBoxVo = new DataBoxVo(COMPARE_MEASURES.get(k), v.intValue());
            String measureName = "较昨日";
            String measureName2 = "较上个基线版本";
            if (oldmap == null || !oldmap.containsKey(k)) {
                dataBoxVo.addSub(measureName, null);
            } else {
                BigDecimal ov = oldmap.get(k);
                dataBoxVo.addSub(measureName, df4.format(v.subtract(ov).intValue()));
            }
            if (oldmap2 == null || !oldmap2.containsKey(k)) {
                dataBoxVo.addSub(measureName2, null);
            } else {
                BigDecimal ov = oldmap2.get(k);
                dataBoxVo.addSub(measureName2, df4.format(v.subtract(ov).intValue()));
            }
            dataBoxVoList.add(dataBoxVo);
        }
        return dataBoxVoList;

    }

    private static Map<Integer, BigDecimal> getMap(List<ProjectMeasures> projectMeasures) {
        Map<Integer, BigDecimal> map = new HashMap<>();
        for (ProjectMeasures projectMeasure : projectMeasures) {
            if (projectMeasure.getValue() == null) {
                projectMeasure.setValue(new BigDecimal(0));
            }
            map.put(projectMeasure.getMetricId(), projectMeasure.getValue());
        }
        return map;
    }

}
