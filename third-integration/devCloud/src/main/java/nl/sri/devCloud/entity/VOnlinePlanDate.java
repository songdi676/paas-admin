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
public class VOnlinePlanDate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计划名称
     */
    private String 上线计划;

    private LocalDate 上线日期;

    private String 版本状态;

    private String 上线日类型;

    /**
     * 首次初版时的需求数
     */
    private BigDecimal 首次初版需求数量;

    /**
     * 首次定版时的需求数
     */
    private BigDecimal 首次定版需求数量;

    @TableField("ONLINE_PLAN_DATE_ID")
    private String onlinePlanDateId;

    @TableField("ONLINE_PLAN_ID")
    private String onlinePlanId;

    @TableField("ONLINE_PLAN_DATE")
    private LocalDate onlinePlanDate;

    /**
     * 基线类型1-初版 2-定版 3-正式版
     */
    @TableField("BASELINE_TYPE")
    private BigDecimal baselineType;

    /**
     * 是否正常上线 0-false 1-true
     */
    @TableField("IS_NORMAL")
    private BigDecimal isNormal;

    /**
     * 是否生效0-false，1-true
     */
    @TableField("IS_VALID")
    private BigDecimal isValid;

    /**
     * 是否开启历史变更开关0-false 1-true
     */
    @TableField("IS_OPEN_HIS_CHANGE")
    private BigDecimal isOpenHisChange;

    /**
     * 每次定版调整的变更数，上线日创建时为0，每次发送定版后更新为本次发送的变更数
     */
    @TableField("CHANGE_COUNT")
    private BigDecimal changeCount;

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
     * 流程实例id
     */
    @TableField("FLOW_INSTANCE_ID")
    private String flowInstanceId;

    /**
     * 流程审批状态 申请状态 1-审批中 2-审批通过
     */
    @TableField("FLOW_STATUS")
    private BigDecimal flowStatus;


}
