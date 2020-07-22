package nl.sri.devCloud.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class VAgileTeam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏捷团队
     */
    @TableField("AGILE_TEAM_ID")
    private String agileTeamId;

    /**
     * 团队名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 虚拟部门id
     */
    @TableField("VIRTUAL_DEPARTMENT_ID")
    private String virtualDepartmentId;

    /**
     * 有效标识 0-有效  1-无效
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 迭代计划周期，以天为单位，默认2周14天一个迭代
     */
    @TableField("PLAN_CYCLE")
    private BigDecimal planCycle;


}
