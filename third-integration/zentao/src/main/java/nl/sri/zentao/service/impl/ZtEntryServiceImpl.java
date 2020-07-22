package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtEntry;
import nl.sri.zentao.mapper.ZtEntryMapper;
import nl.sri.zentao.service.IZtEntryService;
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
public class ZtEntryServiceImpl extends ServiceImpl<ZtEntryMapper, ZtEntry> implements IZtEntryService {

}
