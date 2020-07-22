package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.ZtMailqueue;
import nl.sri.devCloud.mapper.ZtMailqueueMapper;
import nl.sri.devCloud.service.IZtMailqueueService;
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
public class ZtMailqueueServiceImpl extends ServiceImpl<ZtMailqueueMapper, ZtMailqueue> implements IZtMailqueueService {

}
