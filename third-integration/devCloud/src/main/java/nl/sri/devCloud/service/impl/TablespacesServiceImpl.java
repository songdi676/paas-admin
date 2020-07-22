package nl.sri.devCloud.service.impl;

import nl.sri.devCloud.entity.Tablespaces;
import nl.sri.devCloud.mapper.TablespacesMapper;
import nl.sri.devCloud.service.ITablespacesService;
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
public class TablespacesServiceImpl extends ServiceImpl<TablespacesMapper, Tablespaces> implements ITablespacesService {

}
