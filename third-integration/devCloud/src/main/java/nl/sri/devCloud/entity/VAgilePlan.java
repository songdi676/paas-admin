package nl.sri.devCloud.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
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
public class VAgilePlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏捷计划ID
     */
    @TableField("AGILE_PLAN_ID")
    private String agilePlanId;

    /**
     * 父ID
     */
    @TableField("PARENT_ID")
    private String parentId;

    @TableField("NAME")
    private String name;

    /**
     * 计划描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 计划开始时间
     */
    @TableField("PLAN_DATE_START")
    private LocalDate planDateStart;

    /**
     * 计划结束时间
     */
    @TableField("PLAN_DATE_END")
    private LocalDate planDateEnd;

    /**
     * 生命周期
     */
    @TableField("LIFE_CYCLE")
    private BigDecimal lifeCycle;

    /**
     * 业务状态 0-未完成 1-已完成 2-已取消
     */
    @TableField("STATUS")
    private BigDecimal status;

    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CREATE_USER")
    private String createUser;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 关联的团队ID
     */
    @TableField("TEAM_ID")
    private String teamId;


}
