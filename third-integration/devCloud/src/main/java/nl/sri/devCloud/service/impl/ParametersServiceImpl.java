package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Parameters;
import nl.sri.devCloud.mapper.ParametersMapper;
import nl.sri.devCloud.service.IParametersService;
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
public class ParametersServiceImpl extends ServiceImpl<ParametersMapper, Parameters> implements IParametersService {

}
