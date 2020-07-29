package nl.sri.zentao.mapper;

import javafx.beans.binding.ObjectExpression;
import nl.sri.zentao.entity.ZtTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    Map<String,Object> getStatusInfo(@Param("project") String project,@Param("userName") String userName);
}
