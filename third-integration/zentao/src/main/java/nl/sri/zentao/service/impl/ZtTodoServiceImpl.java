package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtTodo;
import nl.sri.zentao.mapper.ZtTodoMapper;
import nl.sri.zentao.service.IZtTodoService;
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
public class ZtTodoServiceImpl extends ServiceImpl<ZtTodoMapper, ZtTodo> implements IZtTodoService {

}
