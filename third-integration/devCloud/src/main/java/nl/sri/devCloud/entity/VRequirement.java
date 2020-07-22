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
public class VRequirement implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer 备注;

    /**
     * 需求审批时间
     */
    private LocalDate 需求审批时间;

    /**
     * 流水号
     */
    @TableField("REQUIREMENT_ID")
    private String requirementId;

    /**
     * 需求名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 需求编号
     */
    @TableField("CODE")
    private String code;

    /**
     * 需求类型
     */
    @TableField("TYPE")
    private BigDecimal type;

    /**
     * 需求状态（默认状态 ;1待分配;）。需求状态定义（已数据字典为主）：1待分配/2待接收/3已接收/4开发中/5测试中/6待验收/7已验收/8待上线/9已上线/10已关闭/11已取消
     */
    @TableField("STATUS")
    private BigDecimal status;

    /**
     * 业务领域
     */
    @TableField("BUSINESS_FIELDS")
    private String businessFields;

    /**
     * 需求优先级  1-Low、2-Medium、3-High
     */
    @TableField("PRIORITY_LEVEL")
    private BigDecimal priorityLevel;

    /**
     * 重要程度
     */
    @TableField("IMPORTANCE_LEVEL")
    private BigDecimal importanceLevel;

    /**
     * 紧急程度
     */
    @TableField("EMERGENCY_LEVEL")
    private BigDecimal emergencyLevel;

    /**
     * 期望上线时间
     */
    @TableField("EXPECT_ONLINE_TIME")
    private LocalDateTime expectOnlineTime;

    /**
     * 需求描述
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 需求登记时间
     */
    @TableField("REGISTER_TIME")
    private LocalDateTime registerTime;

    /**
     * 需求登记人
     */
    @TableField("REGISTER_USER_ID")
    private String registerUserId;

    /**
     * 需求负责单位
     */
    @TableField("RESPONSIBLE_UNIT")
    private String responsibleUnit;

    /**
     * 客户需求负责人
     */
    @TableField("RESPONSIBLE_PERSON")
    private String responsiblePerson;

    /**
     * 客户需求提出编号
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;

    /**
     * 客户需求提出人
     */
    @TableField("CUSTOMER_REPORT")
    private String customerReport;

    /**
     * 客户需求提出单位
     */
    @TableField("CUSTOMER_UNIT")
    private String customerUnit;

    /**
     * 客户需求提出时间
     */
    @TableField("CUSTOMER_REPORT_TIME")
    private LocalDateTime customerReportTime;

    /**
     * 计划上线时间
     */
    @TableField("PLAN_ONLINE_TIME")
    private LocalDateTime planOnlineTime;

    /**
     * 需求开发单位
     */
    @TableField("DEV_UNIT")
    private String devUnit;

    /**
     * 需求开发负责人
     */
    @TableField("DEV_RESPONSIBLE_PERSON")
    private String devResponsiblePerson;

    /**
     * 需求开发预估工时
     */
    @TableField("DEV_EXPECT_WORKLOAD")
    private BigDecimal devExpectWorkload;

    /**
     * 需求开发负责内容
     */
    @TableField("DEV_CONTENT")
    private String devContent;

    /**
     * 需求备注
     */
    @TableField("NOTE")
    private String note;

    /**
     * 附件ID以英文逗号拼接
     */
    @TableField("FILE_IDS")
    private String fileIds;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 创建者
     */
    @TableField("CREATE_USER_ID")
    private String createUserId;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    /**
     * 更新者
     */
    @TableField("UPDATE_USER_ID")
    private String updateUserId;

    /**
     * 数据状态标识（0正常1已删除)
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    /**
     * 关闭日期
     */
    @TableField("CLOSE_TIME")
    private LocalDateTime closeTime;

    /**
     * 租户部门Id
     */
    @TableField("DEPARTMENT_ID")
    private String departmentId;

    /**
     * 外部数据库的需求单id
     */
    private String outerId;

    /**
     * 所属项目
     */
    @TableField("PROJECT_ID")
    private String projectId;

    /**
     * 预估工作量(人天)
     */
    @TableField("EXPECT_WORKLOAD")
    private BigDecimal expectWorkload;

    /**
     * 需求公文编号
     */
    @TableField("OFFICIAL_CODE")
    private String officialCode;


}
