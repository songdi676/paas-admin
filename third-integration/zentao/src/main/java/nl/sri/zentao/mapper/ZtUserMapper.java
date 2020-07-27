package nl.sri.zentao.mapper;

import nl.sri.zentao.entity.ZtUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import javax.validation.constraints.Max;
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
public interface ZtUserMapper extends BaseMapper<ZtUser> {

    List<Map<String,Object>> getUserRoleList();
}
