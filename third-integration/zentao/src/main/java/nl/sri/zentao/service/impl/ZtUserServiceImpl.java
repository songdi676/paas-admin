package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtUser;
import nl.sri.zentao.mapper.ZtUserMapper;
import nl.sri.zentao.service.IZtUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
@Service
public class ZtUserServiceImpl extends ServiceImpl<ZtUserMapper, ZtUser> implements IZtUserService {

}
