package nl.sri.zentao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import nl.sri.zentao.entity.ZtTask;
import nl.sri.zentao.mapper.ZtTaskMapper;
import nl.sri.zentao.service.IZtTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.context.annotation.Primary;
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
@Primary
public class ZtTaskServiceImpl extends ServiceImpl<ZtTaskMapper, ZtTask> implements IZtTaskService {

}
