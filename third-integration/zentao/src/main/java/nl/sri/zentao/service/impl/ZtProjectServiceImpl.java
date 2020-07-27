package nl.sri.zentao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import nl.sri.zentao.entity.ZtProject;
import nl.sri.zentao.mapper.ZtProjectMapper;
import nl.sri.zentao.service.IZtProjectService;
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
@DS("zt")
public class ZtProjectServiceImpl extends ServiceImpl<ZtProjectMapper, ZtProject> implements IZtProjectService {

}
