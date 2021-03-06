package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtBug;
import nl.sri.zentao.mapper.ZtBugMapper;
import nl.sri.zentao.service.IZtBugService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.context.annotation.Primary;
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
@Primary
public class ZtBugServiceImpl extends ServiceImpl<ZtBugMapper, ZtBug> implements IZtBugService {

}
