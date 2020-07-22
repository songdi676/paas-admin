package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.VJenkinsNode;
import nl.sri.devCloud.mapper.VJenkinsNodeMapper;
import nl.sri.devCloud.service.IVJenkinsNodeService;
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
public class VJenkinsNodeServiceImpl extends ServiceImpl<VJenkinsNodeMapper, VJenkinsNode> implements IVJenkinsNodeService {

}
