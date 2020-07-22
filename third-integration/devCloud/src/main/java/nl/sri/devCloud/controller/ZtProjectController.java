package nl.sri.devCloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import nl.sri.devCloud.entity.PageInfo;
import nl.sri.devCloud.entity.ResultData;
import nl.sri.devCloud.entity.ZtProject;
import nl.sri.devCloud.entity.ZtTask;
import nl.sri.devCloud.mapper.ZtProjectMapper;
import nl.sri.devCloud.mapper.ZtTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-20
 */
@RestController
@RequestMapping("/devCloud/zt-project")
public class ZtProjectController {


    @Autowired
    private ZtProjectMapper ztProjectMapper;

    @Autowired
    private ZtTaskMapper ztTaskMapper;


    /**
     * 获取迭代中的任务列表
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getProjectList")
    public ResultData<List<ZtProject>> getProjectList() {
        Page<ZtProject> ztProjectPage = ztProjectMapper.selectPage(new Page<ZtProject>(1, 10), new QueryWrapper<ZtProject>());
        ResultData<List<ZtProject>> resultData = new ResultData<>();
        resultData.setData(ztProjectPage.getRecords());
        PageInfo pageInfo = new PageInfo(Integer.parseInt(ztProjectPage.getCurrent() + ""), Integer.parseInt(ztProjectPage.getSize() + ""), ztProjectPage.getTotal());
        resultData.setPageInfo(pageInfo);
        return resultData;
    }


    /**
     * 获取迭代里的任务总数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/gettaskTotal/{project}")
    public Integer gettaskTotal(@PathVariable(name = "project") String project) {
        return ztTaskMapper.selectCount(new QueryWrapper<ZtTask>()
                .eq("project", project));
    }

    /**
     * 获取迭代里进行中的任务
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getProjectTotal/{project}")
    public Integer getProjectListTotal(@PathVariable(name = "project") String project) {
        return ztTaskMapper.selectCount(new QueryWrapper<ZtTask>()
                .eq("status", "doing")
                .eq("project", project));
    }

    /**
     * 获取迭代里已经关闭（交付）的任务数
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getUserProjectTotal/{project}")
    public Integer getUserProjectTotal(@PathVariable(name = "project") String project) {
        return ztTaskMapper.selectCount(new QueryWrapper<ZtTask>()
                .eq("status", "close")
                .eq("project", project));
    }

    /**
     * 获取迭代预计消耗工时
     *
     * @return
     * @Author wurunxiang
     */
    @GetMapping("/getEsTimate/{project}")
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
    public Integer getDeadLine(@PathVariable(name = "project") String project) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
        for (ZtTask item : tasks) {
            if (item.getDeadline() != null){
                LocalDate deadline = item.getDeadline();
                Date date = new Date();
                if (Integer.parseInt(sdf.format(date)) > deadline.getYear() || Integer.parseInt(sdf1.format(date)) > deadline.getMonthValue() || Integer.parseInt(sdf2.format(date)) > deadline.getDayOfMonth()) {
                    result++;
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
    public Integer getUserTask(@PathVariable(name = "project") String project,@PathVariable(name = "userName") String userName) {
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
    public Integer getUserDoingTask(@PathVariable(name = "project") String project,@PathVariable(name = "userName") String userName) {
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
    public Integer getUserClosedTask(@PathVariable(name = "project") String project,@PathVariable(name = "userName") String userName) {
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
    public Integer getUserEstimateTask(@PathVariable(name = "project") String project,@PathVariable(name = "userName") String userName) {
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
    public Integer getUserConsumedTask(@PathVariable(name = "project") String project,@PathVariable(name = "userName") String userName) {
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
    public Integer getUserDeadLine(@PathVariable(name = "project") String project,@PathVariable(name = "userName") String userName) {
        Integer result = 0;
        List<ZtTask> tasks = ztTaskMapper.selectList(new QueryWrapper<ZtTask>()
                .eq("project", project)
                .eq("lastEditedBy",userName));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("mm");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
        for (ZtTask item : tasks) {
            if (item.getDeadline() != null){
                LocalDate deadline = item.getDeadline();
                Date date = new Date();
                if (Integer.parseInt(sdf.format(date)) > deadline.getYear() || Integer.parseInt(sdf1.format(date)) > deadline.getMonthValue() || Integer.parseInt(sdf2.format(date)) > deadline.getDayOfMonth()) {
                    result++;
                }
            }
        }
        return result;
    }
}
