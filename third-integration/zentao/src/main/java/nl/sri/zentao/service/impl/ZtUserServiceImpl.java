package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtUser;
import nl.sri.zentao.mapper.ZtUserMapper;
import nl.sri.zentao.service.IZtUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

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
