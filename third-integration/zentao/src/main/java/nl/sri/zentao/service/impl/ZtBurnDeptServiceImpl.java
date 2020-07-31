package nl.sri.zentao.service.impl;

import nl.sri.zentao.entity.ZtBurnDept;
import nl.sri.zentao.mapper.ZtBurnDeptMapper;
import nl.sri.zentao.service.IZtBurnDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
@Service
public class ZtBurnDeptServiceImpl extends ServiceImpl<ZtBurnDeptMapper, ZtBurnDept> implements IZtBurnDeptService {

    @Autowired
    private ZtBurnDeptMapper ztBurnDeptMapper;

    public Map<String,Object> getZtBurnDept(String project) {
        Map<String, Object> ztBurnDeptByProject = ztBurnDeptMapper.getZtBurnDeptByProject(project);
        return ztBurnDeptByProject;
    }
}
