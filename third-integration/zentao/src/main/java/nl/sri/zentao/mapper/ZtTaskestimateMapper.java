package nl.sri.zentao.mapper;

import java.util.List;

import nl.sri.zentao.entity.ZtTaskestimate;
import nl.sri.zentao.entity.vo.DeptTaskEstime;
import nl.sri.zentao.entity.vo.ZtBurnDeptVo;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
public interface ZtTaskestimateMapper extends BaseMapper<ZtTaskestimate> {
    List<DeptTaskEstime> getTaskEstimeByProject(@Param("project") Integer project);
}
