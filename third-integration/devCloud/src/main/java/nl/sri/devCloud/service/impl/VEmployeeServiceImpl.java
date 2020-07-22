package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.VEmployee;
import nl.sri.devCloud.mapper.VEmployeeMapper;
import nl.sri.devCloud.service.IVEmployeeService;
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
public class VEmployeeServiceImpl extends ServiceImpl<VEmployeeMapper, VEmployee> implements IVEmployeeService {

}
