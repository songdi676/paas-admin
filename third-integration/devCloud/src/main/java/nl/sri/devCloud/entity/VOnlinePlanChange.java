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
public class VOnlinePlanChange implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 阶段需求单编号
     */
    private String 阶需编号;

    private LocalDate 上线日;

    /**
     * 计划名称
     */
    private String 上线计划;

    private String 变更类型;

    /**
     * 原上线时间
     */
    private LocalDateTime 原上线时间;

    /**
     * 新上线时间
     */
    private LocalDateTime 新上线时间;

    /**
     * 变更说明
     */
    private String 变更原因;

    @TableField("ONLINE_PLAN_CHANGE_ID")
    private String onlinePlanChangeId;

    @TableField("ONLINE_PLAN_DATE_ID")
    private String onlinePlanDateId;

    @TableField("REQUIREMENT_SECTION_ID")
    private String requirementSectionId;

    @TableField("ONLINE_PLAN_ID")
    private String onlinePlanId;

    /**
     * 变更类型 0-正常 1-新增 2-推迟 3-补丁 4-修改
     */
    @TableField("CHANGE_TYPE")
    private BigDecimal changeType;

    /**
     * 变更原因
     */
    @TableField("CHANGE_REASON")
    private BigDecimal changeReason;

    /**
     * 当前基线
     */
    @TableField("BASELINE_TYPE")
    private BigDecimal baselineType;

    /**
     * 审批状态 （1审批中、2审批通过、3审批失败、4作废）
     */
    @TableField("STATUS")
    private BigDecimal status;

    /**
     * 流程实例ID
     */
    @TableField("FLOW_INSTANCE_ID")
    private String flowInstanceId;

    /**
     * 是否有流程 0-没有 1-有
     */
    @TableField("HAS_FLOW")
    private BigDecimal hasFlow;

    /**
     * 审批意见
     */
    @TableField("APPROVAL_OPINION")
    private String approvalOpinion;

    /**
     * 新上线日
     */
    @TableField("NEW_ONLINE_PLAN_DATE_ID")
    private String newOnlinePlanDateId;

    /**
     * 是否超过定版时间( 1:超过0:未超过 )
     */
    @TableField("IS_OVER_TIME")
    private BigDecimal isOverTime;

    /**
     * 版本号
     */
    @TableField("VERSION_CODE")
    private String versionCode;

    @TableField("TAG")
    private String tag;

    @TableField("PROGRAM_LIST")
    private String programList;

    /**
     * 外部数据ID
     */
    @TableField("OUTER_ID")
    private String outerId;

    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CREATE_USER")
    private String createUser;


}
