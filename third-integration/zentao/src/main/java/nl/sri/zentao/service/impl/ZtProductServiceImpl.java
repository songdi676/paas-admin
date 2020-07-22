package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtProduct;
import nl.sri.zentao.mapper.ZtProductMapper;
import nl.sri.zentao.service.IZtProductService;
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
public class ZtProductServiceImpl extends ServiceImpl<ZtProductMapper, ZtProduct> implements IZtProductService {

}
