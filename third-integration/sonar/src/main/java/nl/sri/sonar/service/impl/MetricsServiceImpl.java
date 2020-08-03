package nl.sri.sonar.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import nl.sri.sonar.entity.Metrics;
import nl.sri.sonar.mapper.MetricsMapper;
import nl.sri.sonar.service.IMetricsService;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author songdi
 * @since 2020-08-03
 */
@Service
@Primary
@DS("#header.sonarDataSource")
public class MetricsServiceImpl extends ServiceImpl<MetricsMapper, Metrics> implements IMetricsService {

    public static Map<Integer, Metrics> metricsMap = null;

    @Override
    public Map<Integer, Metrics> getMetricsMap() {
        if (metricsMap != null) {
            return metricsMap;
        }
        List<Metrics> metrics = list();
        metricsMap = metrics.stream().collect(Collectors.toMap(Metrics::getId, metric -> {
            return metric;
        }));

        return metricsMap;
    }
}
