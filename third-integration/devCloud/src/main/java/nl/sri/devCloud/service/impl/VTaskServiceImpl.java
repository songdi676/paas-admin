package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.VTask;
import nl.sri.devCloud.mapper.VTaskMapper;
import nl.sri.devCloud.service.IVTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Service
public class VTaskServiceImpl extends ServiceImpl<VTaskMapper, VTask> implements IVTaskService {

}
