package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtMailqueue;
import nl.sri.zentao.mapper.ZtMailqueueMapper;
import nl.sri.zentao.service.IZtMailqueueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
@Service
public class ZtMailqueueServiceImpl extends ServiceImpl<ZtMailqueueMapper, ZtMailqueue> implements IZtMailqueueService {

}
