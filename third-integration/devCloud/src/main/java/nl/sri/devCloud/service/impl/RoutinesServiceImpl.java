package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Routines;
import nl.sri.devCloud.mapper.RoutinesMapper;
import nl.sri.devCloud.service.IRoutinesService;
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
public class RoutinesServiceImpl extends ServiceImpl<RoutinesMapper, Routines> implements IRoutinesService {

}
