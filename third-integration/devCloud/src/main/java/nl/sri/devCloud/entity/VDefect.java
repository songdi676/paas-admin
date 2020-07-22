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
public class VDefect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 缺陷名称
     */
    @TableField("DEFECT_NAME")
    private String defectName;

    /**
     * 缺陷严重程度。6-建议(Suggest)，5-致命(Urgent)，4-严重(Very high)，3-较高(high)，2-一般(medium)，1-轻微(low)
     */
    @TableField("SEVERITY")
    private BigDecimal severity;

    /**
     * 缺陷类型，1-致命错误，2-性能问题，3-功能不可用，4-功能缺失，5-数据丢失或错误，6-操作界面，7-接口问题，8-输入校验，9-文档问题，10-版本和环境配置，11-要增加的功能，12-脚本/配置错误，13-挂靠需求，14-数据库对象错误
     */
    @TableField("DEFECT_TYPE")
    private BigDecimal defectType;

    /**
     * 缺陷状态。1-新信息(New)，2-打开 (Open)，3-修正(Fixed)，4-拒绝(Rejected)，5-延期(Pending)，6-关闭(Closed)，7-重新打开 (ReOpen)
     */
    @TableField("DEFECT_STATUS")
    private BigDecimal defectStatus;

    /**
     * 解决优先级。4-优化(Optimize)，3-高(high)，2-中 (medium)，1-低(low)
     */
    @TableField("PRIORITY")
    private BigDecimal priority;

    /**
     * 备注说明
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 缺陷编号
     */
    @TableField("DEFECT_NUMBER")
    private String defectNumber;

    /**
     * 发现阶段。1-集成测试，2-系统测试，3-确认测试 ，4-回归测试，5-割接发布，6-系统维护
     */
    @TableField("PHASE")
    private BigDecimal phase;

    /**
     * 引入阶段。1-需求分析，2-软件设计，3-软件编码，4-软件测试
     */
    @TableField("MISSED_PHASE")
    private BigDecimal missedPhase;

    /**
     * 引入原因。1-A1-我方提出需求变更，2-A2-用户提出需求变更，3-A3-对用户需求理解错误，4-A4-用户需求不明确/错误，5-B1-需求分析文档理解错误，6-B2-性能问题（内存、速度、接口等），7-B3-逻辑错误（匹配、顺序、模块关系等），8-B4-文档描述不充分，9-B5-数据结构、数据库设计问题，10-C1 -设计文档理解错误，11-C2-可维护性、可靠性问题，12-C3-性能问题（内存、速度、接口等），13-C4-逻辑错误（功能调用、参数返回、调用顺序、代码可读性等），14-C5-没有遵循编码规范，15-C6-资源获取和释放问题（变量、数据、寄存器等的错误使用），16-C7-旧有程序问题，17-C8-异常分支处理错误，18-C9-缺失、遗漏，19-C10-其他问题，20-D1-功能理解错误，21-D2-测试用例编写错误，25-D3-测试数据问题，23-D4-测试操作错误，24-D5-测试环境错误
     */
    @TableField("CAUSED_PHASE")
    private BigDecimal causedPhase;

    /**
     * 处理人
     */
    @TableField("OPERATOR_ID")
    private String operatorId;

    /**
     * 缺陷描述
     */
    @TableField("DEFECT_DESC")
    private String defectDesc;

    /**
     * 场景用例id（已废，改为 EXECUTION_PLAN_CASE_ID）
     */
    @TableField("SCENE_USE_CASE_ID")
    private String sceneUseCaseId;

    /**
     * 执行计划用例id
     */
    @TableField("EXECUTION_PLAN_CASE_ID")
    private String executionPlanCaseId;

    /**
     * 测试时间
     */
    @TableField("TEST_TIME")
    private LocalDateTime testTime;

    /**
     * 计划修复完成时间
     */
    @TableField("PLAN_COMPLETION_TIME")
    private LocalDateTime planCompletionTime;

    /**
     * 实际修复完成时间
     */
    @TableField("ACTUAL_COMPLETION_TIME")
    private LocalDateTime actualCompletionTime;

    /**
     * 缺陷关闭日期
     */
    @TableField("CLOSE_TIME")
    private LocalDateTime closeTime;

    /**
     * 修改说明
     */
    @TableField("MODIFY_DESCRIPTION")
    private String modifyDescription;

    /**
     * 关联用例ID
     */
    @TableField("USE_CASE_ID")
    private String useCaseId;

    /**
     * 关联故事ID
     */
    @TableField("STORY_ID")
    private String storyId;

    /**
     * 关联产品线ID
     */
    @TableField("PRODUCT_ID")
    private String productId;

    /**
     * 关联迭代计划ID
     */
    @TableField("AGILE_PLAN_ID")
    private String agilePlanId;

    /**
     * 关联需求ID
     */
    @TableField("REQUIREMENT_ID")
    private String requirementId;

    /**
     * 解决的迭代计划ID
     */
    @TableField("SOLVED_PLAN_ID")
    private String solvedPlanId;

    /**
     * 创建者
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 创建时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    /**
     * 0正常 1失效
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;


}
