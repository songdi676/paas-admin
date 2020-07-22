package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Processlist;
import nl.sri.devCloud.mapper.ProcesslistMapper;
import nl.sri.devCloud.service.IProcesslistService;
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
public class ProcesslistServiceImpl extends ServiceImpl<ProcesslistMapper, Processlist> implements IProcesslistService {

}
