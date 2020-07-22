package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.ZtImMessage;
import nl.sri.devCloud.mapper.ZtImMessageMapper;
import nl.sri.devCloud.service.IZtImMessageService;
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
public class ZtImMessageServiceImpl extends ServiceImpl<ZtImMessageMapper, ZtImMessage> implements IZtImMessageService {

}
