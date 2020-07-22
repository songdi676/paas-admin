package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.InnodbSysTables;
import nl.sri.devCloud.mapper.InnodbSysTablesMapper;
import nl.sri.devCloud.service.IInnodbSysTablesService;
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
public class InnodbSysTablesServiceImpl extends ServiceImpl<InnodbSysTablesMapper, InnodbSysTables> implements IInnodbSysTablesService {

}
