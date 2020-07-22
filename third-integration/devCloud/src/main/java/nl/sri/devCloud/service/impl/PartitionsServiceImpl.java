package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Partitions;
import nl.sri.devCloud.mapper.PartitionsMapper;
import nl.sri.devCloud.service.IPartitionsService;
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
public class PartitionsServiceImpl extends ServiceImpl<PartitionsMapper, Partitions> implements IPartitionsService {

}
