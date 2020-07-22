package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Views;
import nl.sri.devCloud.mapper.ViewsMapper;
import nl.sri.devCloud.service.IViewsService;
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
public class ViewsServiceImpl extends ServiceImpl<ViewsMapper, Views> implements IViewsService {

}
