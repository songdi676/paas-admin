package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtImMessage;
import nl.sri.zentao.mapper.ZtImMessageMapper;
import nl.sri.zentao.service.IZtImMessageService;
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
public class ZtImMessageServiceImpl extends ServiceImpl<ZtImMessageMapper, ZtImMessage> implements IZtImMessageService {

}
