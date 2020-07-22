package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.SessionStatus;
import nl.sri.devCloud.mapper.SessionStatusMapper;
import nl.sri.devCloud.service.ISessionStatusService;
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
public class SessionStatusServiceImpl extends ServiceImpl<SessionStatusMapper, SessionStatus> implements ISessionStatusService {

}
