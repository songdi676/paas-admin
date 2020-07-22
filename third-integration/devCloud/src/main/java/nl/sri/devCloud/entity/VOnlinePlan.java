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
public class VOnlinePlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 上线计划主键
     */
    @TableField("ONLINE_PLAN_ID")
    private String onlinePlanId;

    /**
     * 计划名称
     */
    private String 计划名称;

    /**
     * 上线日类型 0-每天 1-每周几 2-每月几日
     */
    @TableField("ONLINE_DATE_TYPE")
    private BigDecimal onlineDateType;

    /**
     * 上线日 根据上线日类型确定：如果类型是0则不用该字段；如果是1则此处是1-7；如果是2则此处是1-N/-1，-1为最后一天。
     */
    @TableField("ONLINE_DATE")
    private String onlineDate;

    /**
     * 上线步骤模板
     */
    @TableField("ONLINE_STEP_CODE")
    private String onlineStepCode;

    /**
     * PUP模板
     */
    @TableField("PUP_CODE")
    private BigDecimal pupCode;

    /**
     * 上线公告模板2-无 1-boss上线公告
     */
    @TableField("ONLINE_NOTICE_CODE")
    private BigDecimal onlineNoticeCode;

    /**
     * 规则状态 0-false关闭 1-true开启
     */
    @TableField("IS_VALID")
    private BigDecimal isValid;

    /**
     * 归属虚拟部门ID
     */
    @TableField("VIRTUAL_DEPT_ID")
    private String virtualDeptId;

    /**
     * 简称标识
     */
    @TableField("SHORT_NAME")
    private String shortName;

    /**
     * 变更审批人，英文逗号隔开
     */
    @TableField("AUDIT_USER_ID")
    private String auditUserId;

    /**
     * 计划负责人，英文逗号隔开
     */
    @TableField("CHARGE_USER_IDS")
    private String chargeUserIds;

    /**
     * 维护组，能修改基线列表阶需状态
     */
    @TableField("MAINTAIN_USER_IDS")
    private String maintainUserIds;

    /**
     * 发布对象邮箱，英文分号隔开
     */
    @TableField("EMAIL_TARGETS")
    private String emailTargets;

    /**
     * 上线安排发布对象
     */
    @TableField("REMIND_EMAILS")
    private String remindEmails;

    /**
     * 上线公告发布对象
     */
    @TableField("NOTICE_EMAILS")
    private String noticeEmails;

    /**
     * 是否灰度 0-false不是 1-true是
     */
    @TableField("IS_GRAY")
    private BigDecimal isGray;

    /**
     * 上线步骤推送配置开关 0-关闭 1-开启
     */
    @TableField("STEP_CONFIG_OPEN")
    private BigDecimal stepConfigOpen;

    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    @TableField("CREATE_USER")
    private String createUser;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;


}
