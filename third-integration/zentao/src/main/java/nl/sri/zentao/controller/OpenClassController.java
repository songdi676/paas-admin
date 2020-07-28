package nl.sri.zentao.controller;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import nl.sri.zentao.entity.*;
import nl.sri.zentao.mapper.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
@Controller
@RequestMapping("/zentao")
@RequiredArgsConstructor
public class OpenClassController {

    @Autowired
    private ZtProjectMapper ztProjectMapper;

    @Autowired
    private ZtProjectproductMapper ztProjectproductMapper;

    @Autowired
    private ZtTaskMapper ztTaskMapper;

    @Autowired
    private ZtUserMapper ztUserMapper;

    @Autowired
    private ZtDeptMapper ztDeptMapper;

    @Autowired
    private ZtGroupMapper ztGroupMapper;

    @Autowired
    private ZtProductMapper ztProductMapper;

    @Autowired
    private ZtBugMapper ztBugMapper;


    /**
     * 获取迭代列表
     *
     * @return
     * @Author wurunxiang
     */
    @PostMapping("/getProjectList")
    @ResponseBody
    @DS("zt")
    public Page<ZtProject> getProjectList(@RequestBody RequestVo<ZtProject> requestVo) {
        Page<ZtProject> ztProjectPage = ztProjectMapper.selectPage(new Page<ZtProject>(requestVo.getPageInfo().getPageNum(), requestVo.getPageInfo().getPageSize()), new QueryWrapper<ZtProject>());
        return ztProjectPage;
    }

    /**
     * 获取用户列表
     *
     * @return
     * @Author wurunxiang
     */
    @PostMapping("/getUserList")
    @ResponseBody
    @DS("zt")
    public ResponseVo<List<ZtUser>> getUserList(@RequestBody RequestVo<ZtUser> requestVo) {
        ResponseVo<List<ZtUser>> responseVo = new ResponseVo<>();
        List<ZtUser> result = new ArrayList<>();
        Page<ZtUser> ztUserPage = ztUserMapper.selectPage(new Page<ZtUser>(requestVo.getPageInfo().getPageNum(), requestVo.getPageInfo().getPageSize()), new QueryWrapper<ZtUser>());
        List<ZtUser> ztUsers = ztUserPage.getRecords();
        List<ZtGroup> ztGroups = ztGroupMapper.selectList(new QueryWrapper<>());
        PageInfo pageInfo = new PageInfo();
        for (ZtUser item : ztUsers) {
            ZtUser ztUser = new ZtUser();
            BeanUtils.copyProperties(item, ztUser);
            for (ZtGroup item1 : ztGroups) {
                if (item1.getRole().equals(ztUser.getRole())) {
                    ztUser.setRole(item1.getDesc());
                }
            }
            result.add(ztUser);
        }
        responseVo.setContent(result);
        pageInfo.setPageNum(Integer.parseInt(ztUserPage.getCurrent() + ""));
        pageInfo.setPageSize(Integer.parseInt(ztUserPage.getSize() + ""));
        pageInfo.setTotal(Integer.parseInt(ztUserPage.getTotal() + ""));
        responseVo.setPageInfo(pageInfo);
        return responseVo;
    }


    /**
     * 获取用户分类职位信息总览
     *
     * @return
     * @Author wurunxiang
     */
    @PostMapping("/getUserRoleList")
    @ResponseBody
    @DS("zt")
    public ResponseVo<List<Map<String, Object>>> getUserRoleList() {
        ResponseVo<List<Map<String, Object>>> responseVo = new ResponseVo<>();
        List<Map<String, Object>> userRoleList = ztUserMapper.getUserRoleList();
        List<ZtGroup> ztGroups = ztGroupMapper.selectList(new QueryWrapper<>());
        userRoleList.forEach(role -> {
            for (ZtGroup item : ztGroups) {
                if (role.get("role").equals(item.getRole())) {
                    role.put("roleName", item.getDesc());
                }
            }
        });
        responseVo.setContent(userRoleList);
        return responseVo;
    }

    /**
     * 获取部门列表
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping(value = "/getDeptList")
    @ResponseBody
    @DS("zt")
    public Page<ZtDept> getDeptList(@RequestBody RequestVo<ZtDept> requestVo) {
        Page<ZtDept> ztDeptPage = ztDeptMapper.selectPage(new Page<ZtDept>(requestVo.getPageInfo().getPageNum(), requestVo.getPageInfo().getPageSize()), new QueryWrapper<ZtDept>());
        return ztDeptPage;
    }

    /**
     * 获取迭代里任务分类总数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserProjectTotal/{project}")
    @ResponseBody
    @DS("zt")
    public Page<ZtTask> getUserProjectTotal(@PathVariable(name = "project") String project) {
        List<String> statusList = ztTaskMapper.getStatusList();
        return ztTaskMapper.selectPage(new Page<>(1,Integer.MAX_VALUE),new QueryWrapper<ZtTask>()
                .in("status", statusList)
                .eq("project", project));
    }

    /**
     * 获取迭代预计消耗工时
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getEsTimate/{project}")
    @ResponseBody
    @DS("zt")
    public Integer getEsTimate(@PathVariable(name = "project") String project) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project));
        for (ZtTask item : tasks) {
            result += Integer.parseInt(item.getEstimate() + "");
        }
        return result;
    }

    /**
     * 获取迭代已消耗工时
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getConsumed/{project}")
    @ResponseBody
    @DS("zt")
    public Integer getConsumed(@PathVariable(name = "project") String project) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project));
        for (ZtTask item : tasks) {
            result += Integer.parseInt(item.getConsumed() + "");
        }
        return result;
    }

    /**
     * 获取迭代剩余工时
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getLeft/{project}")
    @ResponseBody
    @DS("zt")
    public Integer getLeft(@PathVariable(name = "project") String project) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project));
        for (ZtTask item : tasks) {
            result += Integer.parseInt(item.getLeft() + "");
        }
        return result;
    }

    /**
     * 获取本次迭代总超时任务数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getDeadLine/{project}")
    @ResponseBody
    @DS("zt")
    public Integer getDeadLine(@PathVariable(name = "project") String project) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
        for (ZtTask item : tasks) {
            if (item.getDeadline() != null) {
                LocalDate deadline = item.getDeadline();
                Date date = new Date();
                if (Integer.parseInt(sdf.format(date)) < deadline.getYear()){
                    if (Integer.parseInt(sdf1.format(date)) < deadline.getMonthValue()){
                        if (Integer.parseInt(sdf2.format(date)) < deadline.getDayOfMonth()){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * (个人效率指标)迭代分配任务数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserTask/{project}/{userName}")
    @ResponseBody
    @DS("zt")
    public Integer getUserTask(@PathVariable(name = "project") String project,
                               @PathVariable(name = "userName") String userName) {
        return ztTaskMapper.selectCount(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("assignedTo", userName));
    }

    /**
     * (个人效率指标)迭代进行中的任务数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserDoingTask/{project}/{userName}")
    @ResponseBody
    @DS("zt")
    public Integer getUserDoingTask(@PathVariable(name = "project") String project,
                                    @PathVariable(name = "userName") String userName) {
        return ztTaskMapper.selectCount(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("status", "doing")
                .eq("assignedTo", userName));
    }

    /**
     * (个人效率指标)迭代进行中的任务数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserClosedTask/{project}/{userName}")
    @ResponseBody
    @DS("zt")
    public Integer getUserClosedTask(@PathVariable(name = "project") String project,
                                     @PathVariable(name = "userName") String userName) {
        return ztTaskMapper.selectCount(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("status", "closed")
                .eq("assignedTo", userName));
    }

    /**
     * (个人效率指标)迭代分配的任务量
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserEstimateTask/{project}/{userName}")
    @ResponseBody
    @DS("zt")
    public Integer getUserEstimateTask(@PathVariable(name = "project") String project,
                                       @PathVariable(name = "userName") String userName) {
        Integer estimate = 0;
        List<ZtTask> ztTasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("assignedTo", userName));
        for (ZtTask item : ztTasks) {
            estimate += Integer.parseInt(item.getEstimate() + "");
        }
        return estimate;
    }

    /**
     * (个人效率指标)迭代完成的工作量
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserConsumedTask/{project}/{userName}")
    @ResponseBody
    @DS("zt")
    public Integer getUserConsumedTask(@PathVariable(name = "project") String project,
                                       @PathVariable(name = "userName") String userName) {
        Integer consumed = 0;
        List<ZtTask> ztTasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("assignedTo", userName));
        for (ZtTask item : ztTasks) {
            consumed += Integer.parseInt(item.getConsumed() + "");
        }
        return consumed;
    }

    /**
     * (个人效率指标)迭代个人超时工作量
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserDeadLine/{project}/{userName}")
    @ResponseBody
    @DS("zt")
    public Integer getUserDeadLine(@PathVariable(name = "project") String project,
                                   @PathVariable(name = "userName") String userName) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("lastEditedBy", userName));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
        for (ZtTask item : tasks) {
            if (item.getDeadline() != null) {
                LocalDate deadline = item.getDeadline();
                Date date = new Date();
                if (Integer.parseInt(sdf.format(date)) > deadline.getYear()
                        || Integer.parseInt(sdf1.format(date)) > deadline.getMonthValue()
                        || Integer.parseInt(sdf2.format(date)) > deadline.getDayOfMonth()) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * 获取迭代周期
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getZtProjectCycle/{projectId}")
    @ResponseBody
    @DS("zt")
    public ResponseVo<Map<String, Object>> getUserEstimateTask(@PathVariable(name = "projectId") String projectId) {
        ResponseVo<Map<String, Object>> responseVo = new ResponseVo<>();
        ZtProject ztProject = ztProjectMapper.selectById(projectId);
        Map<String, Object> result = new HashMap<>();
        result.put("begin", ztProject.getBegin());
        result.put("end", ztProject.getEnd());
        responseVo.setContent(result);
        return responseVo;
    }

    /**
     * 获取迭代列表
     *
     * @return
     * @Author wurunxiang
     */
    @PostMapping("/getZtProjectList")
    @ResponseBody
    @DS("zt")
    public ResponseVo<List<ZtProject>> getZtProjectList(@RequestBody PageInfo pageInfo) {
        ResponseVo<List<ZtProject>> responseVo = new ResponseVo<>();
        Page page = new Page();
        page.setCurrent(pageInfo.getPageNum());
        page.setSize(pageInfo.getPageSize());
        Page<ZtProject> ztProjectPage = ztProjectMapper.selectPage(page, new QueryWrapper<ZtProject>()
                .eq("deleted", "0"));
        responseVo.setContent(ztProjectPage.getRecords());
        PageInfo resultPageInfo = new PageInfo(Integer.parseInt(ztProjectPage.getCurrent() + ""), Integer.parseInt(ztProjectPage.getSize() + ""), Integer.parseInt(ztProjectPage.getTotal() + ""));
        responseVo.setPageInfo(resultPageInfo);
        return responseVo;
    }


    /**
     * 获取产品列表
     *
     * @return
     * @Author wurunxiang
     */
    @PostMapping("/getZtProductList")
    @ResponseBody
    @DS("zt")
    public ResponseVo<List<ZtProduct>> getZtProductList(@RequestBody PageInfo pageInfo) {
        ResponseVo<List<ZtProduct>> responseVo = new ResponseVo<>();
        Page page = new Page();
        page.setCurrent(pageInfo.getPageNum());
        page.setSize(pageInfo.getPageSize());
        Page<ZtProduct> ztProductPage = ztProductMapper.selectPage(page, new QueryWrapper<ZtProduct>()
                .eq("deleted", "0"));
        responseVo.setContent(ztProductPage.getRecords());
        PageInfo resultPageInfo = new PageInfo(Integer.parseInt(ztProductPage.getCurrent() + ""), Integer.parseInt(ztProductPage.getSize() + ""), Integer.parseInt(ztProductPage.getTotal() + ""));
        responseVo.setPageInfo(resultPageInfo);
        return responseVo;
    }

    /**
     * 根据产品id获取迭代列表
     *
     * @return
     * @Author wurunxiang
     */
    @PostMapping("/getProductProjectList")
    @ResponseBody
    @DS("zt")
    public ResponseVo<List<ZtProject>> getProductProjectList(@RequestBody RequestVo<String> req) {
        ResponseVo<List<ZtProject>> responseVo = new ResponseVo<>();
        QueryWrapper<ZtProjectproduct> wrapper = new QueryWrapper<>();
        if (req.getParams() != null){
            wrapper.eq("product",req.getParams());
        }
        List<ZtProjectproduct> ztProjectproducts = ztProjectproductMapper.selectList(wrapper);
        List<Integer> projects = new ArrayList<>();
        ztProjectproducts.forEach(ztProjectproduct -> {
            projects.add(ztProjectproduct.getProject());
        });
        List<ZtProject> ztProjects = ztProjectMapper.selectList(new QueryWrapper<ZtProject>().in("id", projects));
        responseVo.setContent(ztProjects);
        return responseVo;
    }

    /**
     * 根据产品id获取迭代列表
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getBugInfo")
    @ResponseBody
    @DS("zt")
    public ResponseVo<Map<String,Object>> getBugInfo() {
        ResponseVo<Map<String,Object>> responseVo = new ResponseVo<>();
        responseVo.setContent(ztBugMapper.getBugInfo());
        return responseVo;
    }
}