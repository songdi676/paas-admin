package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.UserPrivileges;
import nl.sri.devCloud.mapper.UserPrivilegesMapper;
import nl.sri.devCloud.service.IUserPrivilegesService;
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
public class UserPrivilegesServiceImpl extends ServiceImpl<UserPrivilegesMapper, UserPrivileges> implements IUserPrivilegesService {

}
