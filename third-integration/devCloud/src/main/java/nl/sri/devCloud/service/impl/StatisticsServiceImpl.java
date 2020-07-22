package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Statistics;
import nl.sri.devCloud.mapper.StatisticsMapper;
import nl.sri.devCloud.service.IStatisticsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Service
public class StatisticsServiceImpl extends ServiceImpl<StatisticsMapper, Statistics> implements IStatisticsService {

}
