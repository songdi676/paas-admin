package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbSysTablestats;
import nl.sri.devCloud.mapper.InnodbSysTablestatsMapper;
import nl.sri.devCloud.service.IInnodbSysTablestatsService;
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
public class InnodbSysTablestatsServiceImpl extends ServiceImpl<InnodbSysTablestatsMapper, InnodbSysTablestats> implements IInnodbSysTablestatsService {

}
