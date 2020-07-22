package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.VPlanItem;
import nl.sri.devCloud.mapper.VPlanItemMapper;
import nl.sri.devCloud.service.IVPlanItemService;
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
public class VPlanItemServiceImpl extends ServiceImpl<VPlanItemMapper, VPlanItem> implements IVPlanItemService {

}
