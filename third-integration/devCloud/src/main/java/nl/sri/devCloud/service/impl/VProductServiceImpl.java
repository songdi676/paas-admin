package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.VProduct;
import nl.sri.devCloud.mapper.VProductMapper;
import nl.sri.devCloud.service.IVProductService;
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
public class VProductServiceImpl extends ServiceImpl<VProductMapper, VProduct> implements IVProductService {

}
