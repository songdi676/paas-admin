package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.GlobalStatus;
import nl.sri.devCloud.mapper.GlobalStatusMapper;
import nl.sri.devCloud.service.IGlobalStatusService;
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
public class GlobalStatusServiceImpl extends ServiceImpl<GlobalStatusMapper, GlobalStatus> implements IGlobalStatusService {

}
