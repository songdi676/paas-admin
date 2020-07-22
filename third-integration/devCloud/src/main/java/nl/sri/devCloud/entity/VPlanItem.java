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
public class VPlanItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计划项标识
     */
    @TableField("ITEM_ID")
    private String itemId;

    /**
     * 上级计划项标识，0-顶级
     */
    @TableField("SUPER_ITEM_ID")
    private String superItemId;

    /**
     * 里程碑（默认2否；1是2否）
     */
    @TableField("MILESTONE")
    private BigDecimal milestone;

    /**
     * 计划标识
     */
    @TableField("PLAN_ID")
    private String planId;

    /**
     * 计划项名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 计划工期（工期单位：工作日）
     */
    @TableField("DURATION")
    private BigDecimal duration;

    /**
     * 计划工时（自动计算）
     */
    @TableField("PLAN_MANHOURS")
    private BigDecimal planManhours;

    /**
     * 实际开始时间（自动计算）
     */
    @TableField("ACTUAL_DATE_START")
    private LocalDateTime actualDateStart;

    /**
     * 实际结束时间（自动计算）
     */
    @TableField("ACTUAL_DATE_END")
    private LocalDateTime actualDateEnd;

    /**
     * 累计完成工时（自动计算）
     */
    @TableField("MANHOURS")
    private BigDecimal manhours;

    /**
     * 分解需求标识(默认为0)
     */
    @TableField("REQUIREMENT_SECTION_ID")
    private String requirementSectionId;

    /**
     * 完成百分比
     */
    @TableField("PERCENT_COMPLETE")
    private BigDecimal percentComplete;

    /**
     * 计划开始时间
     */
    @TableField("PLAN_DATE_START")
    private LocalDateTime planDateStart;

    /**
     * 计划结束时间
     */
    @TableField("PLAN_DATE_END")
    private LocalDateTime planDateEnd;

    /**
     * 任务等级：1-非常紧急、2-紧急、3-一般、4-不紧急(默认3)
     */
    @TableField("TASK_LEVEL")
    private BigDecimal taskLevel;

    /**
     * 任务类型【对应NLOA库NLOA_WORKTYPE_ORGANIZATION数据】
     */
    @TableField("TASK_TYPE")
    private BigDecimal taskType;

    /**
     * 叶子 （1是2否）
     */
    @TableField("LEAF")
    private BigDecimal leaf;

    /**
     * 展开状态（默认2；1是2否）
     */
    @TableField("EXPEND")
    private BigDecimal expend;

    /**
     * WBS编码
     */
    @TableField("WBS_CODE")
    private String wbsCode;

    /**
     * 计划项状态：1待确认、2进行中、3已完成
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
     * 数据状态标识（0正常1已删除)默认为0
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    @TableField("THRESHOLD_VALUE")
    private BigDecimal thresholdValue;

    /**
     * 		1越晚越好RN		2越早越好RN		3不得早于...完成RN		4不得晚于...完成RN		5必须开始于RN		6必须完成于RN		7不得早于...开始RN		8不得晚于...开始
     */
    @TableField("RESTRICT_TYPE")
    private BigDecimal restrictType;

    @TableField("RESTRICT_TIME")
    private LocalDateTime restrictTime;

    /**
     * 是否冻结
     */
    @TableField("ISFREEZE")
    private String isfreeze;

    /**
     * 是否冻结后新增
     */
    @TableField("ISFREEZEACTION")
    private String isfreezeaction;

    /**
     * ICMS子任务UID
     */
    @TableField("REQ_ATTR15")
    private String reqAttr15;

    /**
     * ICMS需求UID
     */
    @TableField("REQ_ATTR16")
    private String reqAttr16;

    /**
     * ICMS子任务测试状态
     */
    @TableField("DECOMPOSTION_STATUS")
    private String decompostionStatus;

    /**
     * 开发任务 完成百分比
     */
    @TableField("DEVELOP_PERCENT_COMPLETE")
    private BigDecimal developPercentComplete;

    /**
     * 测试任务 完成百分比
     */
    @TableField("TEST_PERCENT_COMPLETE")
    private BigDecimal testPercentComplete;

    /**
     * 需求任务 完成百分比
     */
    @TableField("REQUIREMENT_PERCENT_COMPLETE")
    private BigDecimal requirementPercentComplete;

    /**
     * 设计任务 完成百分比
     */
    @TableField("DESIGN_PERCENT_COMPLETE")
    private BigDecimal designPercentComplete;

    /**
     * UI UE任务 完成百分比
     */
    @TableField("UIUE_PERCENT_COMPLETE")
    private BigDecimal uiuePercentComplete;

    /**
     * ICMS导入批次
     */
    @TableField("IMPORT_NUM")
    private String importNum;

    /**
     * 是否需要测试(0、否 1、是)
     */
    @TableField("IS_NEED_TEST")
    private BigDecimal isNeedTest;

    /**
     * 开发计划完成日期
     */
    @TableField("DEVELOP_END_DATE")
    private LocalDateTime developEndDate;

    /**
     * 开发人员
     */
    @TableField("DEVELOP_USERS")
    private String developUsers;

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
     * 模块备注
     */
    @TableField("MODEL_NAME")
    private String modelName;

    /**
     * 数据来源
     */
    @TableField("DATA_SRC")
    private BigDecimal dataSrc;

    /**
     * 任务难度
     */
    @TableField("DIFFICULTY")
    private BigDecimal difficulty;

    /**
     * 专题ID
     */
    @TableField("SUBJECT_ID")
    private BigDecimal subjectId;

    /**
     * 是否UI/UE介入(0、不需要 1、需要)
     */
    @TableField("IS_NEED_UI")
    private BigDecimal isNeedUi;

    /**
     * 用户故事计划项，只有故事卡片能填写该字段，其余为NULL
     */
    @TableField("USER_STORY_ID")
    private String userStoryId;

    /**
     * 缺陷ID
     */
    @TableField("DEFECT_ID")
    private BigDecimal defectId;

    /**
     * 卡片是否已打印0-未打印 1-已打印
     */
    @TableField("IS_PRINT")
    private BigDecimal isPrint;

    /**
     * 关联的敏捷计划
     */
    @TableField("AGILE_PLAN_ID")
    private String agilePlanId;

    /**
     * 卡片颜色
     */
    @TableField("COLOR")
    private String color;


}
