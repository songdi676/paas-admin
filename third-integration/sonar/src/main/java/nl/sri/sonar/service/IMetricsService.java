package nl.sri.sonar.service;

import java.util.Map;

import nl.sri.sonar.entity.Metrics;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author songdi
 * @since 2020-08-03
 */
public interface IMetricsService extends IService<Metrics> {
    Map<Integer, Metrics> getMetricsMap();
}
