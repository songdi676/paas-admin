package nl.sri.devCloud.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class VModuleInteCompileTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流水线id
     */
    private String moduleCompileId;

    /**
     * 需求编号
     */
    private String reqNo;

    /**
     * 版本标签号
     */
    private String versionLabel;

    /**
     * 修改次数
     */
    private Integer modifyCount;

    /**
     * 编译清单
     */
    private String archiveFiles;

    /**
     * 提交人id
     */
    private String submitUserId;

    /**
     * 失败次数
     */
    private Integer failCount;

    /**
     * 最近的编译order
     */
    private String latestOrderId;

    /**
     * 分支
     */
    private String branch;

    /**
     * 执行状态
     */
    private Integer executeStatus;

    /**
     * 结束时间
     */
    private LocalDateTime endDate;

    /**
     * jenkins的编译序号
     */
    private Integer jenkinsBuildNum;

    /**
     * 目标程序列表
     */
    private String targetProgramList;

    /**
     * 源代码修改说明
     */
    private String mark;

    /**
     * 需求id
     */
    private String requirementId;

    private BigDecimal objStatus;

    private LocalDateTime createDate;

    private String createUser;

    private LocalDateTime updateDate;

    private String updateUser;

    /**
     * 租户id
     */
    private String appId;

    /**
     * 状态(0:失效，1：有效)
     */
    private Boolean status;

    /**
     * 任务需求编号 （ req_no - 末尾IP）
     */
    private String taskReqNo;

    private String compileTypeJson;

    private String customField2;

    /**
     * 阶段需求ID
     */
    private String requirementSectionId;

    /**
     * 提交者的姓名
     */
    private String submitUserName;

    /**
     * 队列id
     */
    private String queueId;

    /**
     * 开发云pms队列状态（0：不在队列，1：在队列，2：执行失败）
     */
    private Integer queueStatus;


}
