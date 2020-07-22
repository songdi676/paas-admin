package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Profiling;
import nl.sri.devCloud.mapper.ProfilingMapper;
import nl.sri.devCloud.service.IProfilingService;
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
public class ProfilingServiceImpl extends ServiceImpl<ProfilingMapper, Profiling> implements IProfilingService {

}
