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
public class VUserStory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 故事ID
     */
    @TableField("USER_STORY_ID")
    private String userStoryId;

    /**
     * 用户故事序列，每个租户的用户故事都有各自的序列，序列数值取统一编号服务
     */
    @TableField("USER_STORY_SEQ")
    private String userStorySeq;

    /**
     * 故事编号
     */
    @TableField("USER_STORY_CODE")
    private String userStoryCode;

    /**
     * 描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 完工日期
     */
    @TableField("FINISH_DATE")
    private LocalDateTime finishDate;

    /**
     * 工作量
     */
    @TableField("WORKLOAD")
    private BigDecimal workload;

    /**
     * 工期
     */
    @TableField("DURATION")
    private BigDecimal duration;

    /**
     * 记录状态0-正常 1-删除
     */
    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    /**
     * 用户故事状态来源字典 0-待确认 1-已澄清 2-进行中 3-待验收 4-已验收 5-已上线 6-已取消
     */
    @TableField("STATUS")
    private String status;

    /**
     * 用户故事优先级来源字典 0-低 1-中 2-高
     */
    @TableField("PRIORITY")
    private String priority;

    /**
     * 创建人
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 故事集ID
     */
    @TableField("GROUP_ID")
    private String groupId;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    /**
     * 需求单Id
     */
    @TableField("REQUIREMENT_ID")
    private String requirementId;

    /**
     * 关联需求ID
     */
    @TableField("REQ_SEC_ID")
    private BigDecimal reqSecId;

    /**
     * 关联项目ID
     */
    @TableField("PROJECT_ID")
    private BigDecimal projectId;

    /**
     * 关联敏捷计划ID
     */
    @TableField("AGILE_PLAN_ID")
    private String agilePlanId;

    @TableField("PRODUCT_MODULE_NAME")
    private String productModuleName;

    /**
     * 产品模块 xxx/xxx/xx形式
     */
    @TableField("PRODUCT_MODULE")
    private String productModule;

    /**
     * 关联产品模块ID
     */
    @TableField("PRODUCT_ID")
    private String productId;

    @TableField("PRODUCT_LINE_NAME")
    private String productLineName;

    /**
     * 产品线 xxx/xxx/xx形式
     */
    @TableField("PRODUCT_LINE")
    private String productLine;

    /**
     * 关联产品线Id
     */
    @TableField("PRODUCT_LINE_ID")
    private String productLineId;

    /**
     * 故事归属团队
     */
    @TableField("TEAM_ID")
    private String teamId;

    /**
     * 用户故事类型来源字典 1-业务故事 2-技术故事 3-生产故障
     */
    @TableField("TYPE")
    private String type;

    /**
     * 故事规模估算
     */
    @TableField("SCALE")
    private String scale;

    /**
     * 验收标准
     */
    @TableField("ACCEPTANCE_CRITERIA")
    private String acceptanceCriteria;

    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;

    /**
     * 提出人
     */
    @TableField("PROPOSED_PERSON")
    private String proposedPerson;

    /**
     * 责任人
     */
    @TableField("RESPONSIBLE_PERSON")
    private String responsiblePerson;

    @TableField("RESPONSIBLE_PERSON_NAME")
    private String responsiblePersonName;

    /**
     * 就绪时间
     */
    @TableField("READY_TIME")
    private LocalDateTime readyTime;

    /**
     * 交付时间
     */
    @TableField("DELIVER_TIME")
    private LocalDateTime deliverTime;


}
