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
public class VRequirementSection implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需求单ID
     */
    @TableField("REQUIREMENT_ID")
    private String requirementId;

    /**
     * 阶段需求单编号
     */
    @TableField("SECTION_CODE")
    private String sectionCode;

    /**
     * 所属项目
     */
    @TableField("PROJECT_ID")
    private String projectId;

    /**
     * 阶段需求开发负责人
     */
    @TableField("SECTION_DEVELOP_USER")
    private String sectionDevelopUser;

    /**
     * 阶段需求测试负责人
     */
    @TableField("SECTION_TEST_USER")
    private String sectionTestUser;

    /**
     * 阶段需求状态
     */
    @TableField("SECTION_STATUS")
    private BigDecimal sectionStatus;

    /**
     * 计划上线时间
     */
    @TableField("SECTION_PLAN_ONLINE_TIME")
    private LocalDate sectionPlanOnlineTime;

    /**
     * 自估工作量
     */
    @TableField("SECTION_WORKLOAD")
    private BigDecimal sectionWorkload;

    /**
     * 需求开始时间
     */
    @TableField("REQUIREMENT_START_TIME")
    private LocalDate requirementStartTime;

    /**
     * 需求结束时间
     */
    @TableField("REQUIREMENT_END_TIME")
    private LocalDate requirementEndTime;

    /**
     * 需求人员
     */
    @TableField("REQUIREMENT_USER")
    private String requirementUser;

    /**
     * 设计开始时间
     */
    @TableField("DESIGN_START_TIME")
    private LocalDate designStartTime;

    /**
     * 设计结束时间
     */
    @TableField("DESIGN_END_TIME")
    private LocalDate designEndTime;

    /**
     * 设计人员
     */
    @TableField("DESIGN_USER")
    private String designUser;

    /**
     * 开发开始时间
     */
    @TableField("DEVELOP_START_TIME")
    private LocalDate developStartTime;

    /**
     * 开发结束时间
     */
    @TableField("DEVELOP_END_TIME")
    private LocalDate developEndTime;

    /**
     * 开发人员
     */
    @TableField("DEVELOP_USER")
    private String developUser;

    /**
     * 测试开始时间
     */
    @TableField("TEST_START_TIME")
    private LocalDate testStartTime;

    /**
     * 测试结束时间
     */
    @TableField("TEST_END_TIME")
    private LocalDate testEndTime;

    /**
     * 测试人员
     */
    @TableField("TEST_USER")
    private String testUser;

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
     * 数据状态
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    /**
     * 外部系统阶段需求编号
     */
    @TableField("OUTER_ID")
    private String outerId;


}
