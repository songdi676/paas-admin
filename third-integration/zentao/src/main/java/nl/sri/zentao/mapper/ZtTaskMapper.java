package nl.sri.zentao.mapper;

import nl.sri.zentao.entity.ZtTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
public interface ZtTaskMapper extends BaseMapper<ZtTask> {

    List<String> getStatusList();
}
