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
public class VTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务标识
     */
    @TableField("TASK_ID")
    private String taskId;

    /**
     * 计划项标识
     */
    @TableField("ITEM_ID")
    private String itemId;

    /**
     * 任务处理人标识
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 任务名称
     */
    @TableField("TASK_NAME")
    private String taskName;

    /**
     * 资源投入百分比
     */
    @TableField("RES_COST_PERCENT")
    private BigDecimal resCostPercent;

    /**
     * 完成百分比
     */
    @TableField("PERCENT_COMPLETE")
    private BigDecimal percentComplete;

    /**
     * 累计完成工时
     */
    @TableField("MANHOURS")
    private BigDecimal manhours;

    /**
     * 类型
     */
    @TableField("TYPE")
    private BigDecimal type;

    /**
     * 计划开始时间（
     */
    @TableField("PLAN_DATE_START")
    private LocalDateTime planDateStart;

    /**
     * 计划结束时间
     */
    @TableField("PLAN_DATE_END")
    private LocalDateTime planDateEnd;

    /**
     * 实际开始时间
     */
    @TableField("ACTUAL_DATE_START")
    private LocalDateTime actualDateStart;

    /**
     * 实际结束时间
     */
    @TableField("ACTUAL_DATE_END")
    private LocalDateTime actualDateEnd;

    /**
     * 任务状态：1待确认、2进行中、3完成
     */
    @TableField("STATUS")
    private BigDecimal status;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CREATE_USER_ID")
    private String createUserId;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("UPDATE_USER_ID")
    private String updateUserId;

    /**
     * 数据状态标识（0正常1已删除2已被拆分)默认为0
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    /**
     * 任务处理人类型
     */
    @TableField("USER_TYPE")
    private BigDecimal userType;

    /**
     * 计划工时
     */
    @TableField("PLAN_MANHOURS")
    private BigDecimal planManhours;

    /**
     * 任务类型
     */
    @TableField("TASK_TYPE")
    private BigDecimal taskType;

    /**
     * ICMS子任务的UID
     */
    @TableField("REQ_ATTR15")
    private String reqAttr15;

    /**
     * 是否需要测试
     */
    @TableField("IS_NEED_TEST")
    private BigDecimal isNeedTest;

    /**
     * 0、未发送 1、已发送
     */
    @TableField("SEND_EMAIL_STATUS")
    private BigDecimal sendEmailStatus;

    /**
     * 任务上线测试检查点
     */
    @TableField("TASK_TRACK_POINT")
    private String taskTrackPoint;

    /**
     * ICMS导入批次编号
     */
    @TableField("IMPORT_NUM")
    private String importNum;

    /**
     * 计划ID
     */
    @TableField("PLAN_ID")
    private BigDecimal planId;

    /**
     * 阶段需求id
     */
    @TableField("REQUIREMENT_SECTION_ID")
    private String requirementSectionId;

    /**
     * 需求ID
     */
    @TableField("REQUIREMENT_ID")
    private String requirementId;

    /**
     * 项目ID
     */
    @TableField("PROJECT_ID")
    private BigDecimal projectId;

    /**
     * 计划工期（工期单位：工作日）
     */
    @TableField("DURATION")
    private BigDecimal duration;

    /**
     * 原任务负责人
     */
    @TableField("FROMUSERID")
    private BigDecimal fromuserid;

    /**
     * 专题ID
     */
    @TableField("SUBJECT_ID")
    private BigDecimal subjectId;

    /**
     * 所属敏捷计划ID
     */
    @TableField("AGILE_PLAN_ID")
    private String agilePlanId;

    /**
     * 负责人
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 用户故事标识
     */
    @TableField("USER_STORY_ID")
    private String userStoryId;


}
