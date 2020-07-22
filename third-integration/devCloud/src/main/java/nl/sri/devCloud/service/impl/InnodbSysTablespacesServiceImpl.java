package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbSysTablespaces;
import nl.sri.devCloud.mapper.InnodbSysTablespacesMapper;
import nl.sri.devCloud.service.IInnodbSysTablespacesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-20
 */
@Service
public class InnodbSysTablespacesServiceImpl extends ServiceImpl<InnodbSysTablespacesMapper, InnodbSysTablespaces> implements IInnodbSysTablespacesService {

}
