package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.VProject;
import nl.sri.devCloud.mapper.VProjectMapper;
import nl.sri.devCloud.service.IVProjectService;
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
public class VProjectServiceImpl extends ServiceImpl<VProjectMapper, VProject> implements IVProjectService {

}
