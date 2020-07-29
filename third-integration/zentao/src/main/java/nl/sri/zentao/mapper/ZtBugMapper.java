package nl.sri.zentao.mapper;

import nl.sri.zentao.entity.ZtBug;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
public interface ZtBugMapper extends BaseMapper<ZtBug> {

    Map<String,Object> getBugInfo(@Param("project") String project);
}
