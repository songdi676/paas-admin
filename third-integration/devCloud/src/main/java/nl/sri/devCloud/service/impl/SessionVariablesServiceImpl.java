package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.SessionVariables;
import nl.sri.devCloud.mapper.SessionVariablesMapper;
import nl.sri.devCloud.service.ISessionVariablesService;
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
public class SessionVariablesServiceImpl extends ServiceImpl<SessionVariablesMapper, SessionVariables> implements ISessionVariablesService {

}
