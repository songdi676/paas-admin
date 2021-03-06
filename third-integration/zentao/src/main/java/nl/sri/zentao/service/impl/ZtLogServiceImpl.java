package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtLog;
import nl.sri.zentao.mapper.ZtLogMapper;
import nl.sri.zentao.service.IZtLogService;
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
public class ZtLogServiceImpl extends ServiceImpl<ZtLogMapper, ZtLog> implements IZtLogService {

}
