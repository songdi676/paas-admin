package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbMetrics;
import nl.sri.devCloud.mapper.InnodbMetricsMapper;
import nl.sri.devCloud.service.IInnodbMetricsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-20
 */
@Service
public class InnodbMetricsServiceImpl extends ServiceImpl<InnodbMetricsMapper, InnodbMetrics> implements IInnodbMetricsService {

}
