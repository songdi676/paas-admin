package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbLockWaits;
import nl.sri.devCloud.mapper.InnodbLockWaitsMapper;
import nl.sri.devCloud.service.IInnodbLockWaitsService;
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
public class InnodbLockWaitsServiceImpl extends ServiceImpl<InnodbLockWaitsMapper, InnodbLockWaits> implements IInnodbLockWaitsService {

}
