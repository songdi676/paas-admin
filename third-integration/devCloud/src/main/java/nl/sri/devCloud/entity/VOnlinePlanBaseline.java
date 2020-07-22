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
public class VOnlinePlanBaseline implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 基线ID
     */
    @TableField("BASELINE_ID")
    private String baselineId;

    /**
     * 阶段需求单编号
     */
    private String 阶需编号;

    /**
     * 计划名称
     */
    private String 所在计划;

    private LocalDate 上线日;

    private String 变更类型;

    /**
     * 标签值
     */
    private String 阶段状态;

    /**
     * 实际上线时间
     */
    private LocalDate 实际上线时间;

    /**
     * 首次初版的时间
     */
    private LocalDateTime 首次初版时间;

    /**
     * 首次定版的时间
     */
    private LocalDateTime 首次定版时间;

    /**
     * 上线计划
     */
    @TableField("ONLINE_PLAN_ID")
    private String onlinePlanId;

    /**
     * 上线日ID
     */
    @TableField("ONLINE_PLAN_DATE_ID")
    private String onlinePlanDateId;

    /**
     * 阶段需求ID
     */
    @TableField("REQUIREMENT_SECTION_ID")
    private String requirementSectionId;

    /**
     * 配置负责人，英文逗号隔开
     */
    @TableField("MAINTAIN_IDS")
    private String maintainIds;

    /**
     * 变更类型 0-正常 1-新增 2-推迟 3-补丁 4-修改
     */
    @TableField("CHANGE_TYPE")
    private BigDecimal changeType;

    /**
     * 基线确认状态0未确认 2-已确认 
     */
    @TableField("CONFIRM_STATUS")
    private BigDecimal confirmStatus;

    /**
     * 创建类型 1-初版自动生成 2-初版手动生成 3-定版自动生成 4-定版手动生成 5-正式版手动生成
     */
    @TableField("CREATE_TYPE")
    private BigDecimal createType;

    /**
     * 是否定版发布超时 0-否 1-是
     */
    @TableField("IS_OVER")
    private BigDecimal isOver;

    /**
     * 是否挂靠 0否 1-是
     */
    @TableField("IS_LINK")
    private BigDecimal isLink;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CREATE_USER")
    private String createUser;


}
