package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbBufferPoolStats;
import nl.sri.devCloud.mapper.InnodbBufferPoolStatsMapper;
import nl.sri.devCloud.service.IInnodbBufferPoolStatsService;
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
public class InnodbBufferPoolStatsServiceImpl extends ServiceImpl<InnodbBufferPoolStatsMapper, InnodbBufferPoolStats> implements IInnodbBufferPoolStatsService {

}
