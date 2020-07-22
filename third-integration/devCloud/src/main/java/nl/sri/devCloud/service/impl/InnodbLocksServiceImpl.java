package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbLocks;
import nl.sri.devCloud.mapper.InnodbLocksMapper;
import nl.sri.devCloud.service.IInnodbLocksService;
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
public class InnodbLocksServiceImpl extends ServiceImpl<InnodbLocksMapper, InnodbLocks> implements IInnodbLocksService {

}
