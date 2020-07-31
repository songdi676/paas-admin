package nl.sri.zentao.mapper;

import nl.sri.zentao.entity.ZtBurnDept;
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
public interface ZtBurnDeptMapper extends BaseMapper<ZtBurnDept> {

    public Map<String,Object> getZtBurnDeptByProject(@Param("project") String project);
}
