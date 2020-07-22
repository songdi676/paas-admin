package nl.sri.devCloud.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
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
public class VModuleRelCompileTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 上线日期
     */
    private String onlineDate;

    /**
     * 任务需求编号
     */
    private String taskReqNo;

    /**
     * 版本标签号
     */
    private String versionLabel;

    /**
     * 模块id
     */
    private String moduleId;

    /**
     * 流水线id
     */
    private String moduleCompileId;

    /**
     * 最新的order id
     */
    private String latestOrderId;

    /**
     * 修改次数
     */
    private Integer modifyCount;

    /**
     * 失败次数
     */
    private Integer failCount;

    /**
     * 清单列表
     */
    private String archiveFiles;

    /**
     * 处理状态
     */
    private Integer dealStatus;

    /**
     * 执行状态
     */
    private Integer executeStatus;

    /**
     * 提交人
     */
    private String submitUser;

    /**
     * 提交人姓名
     */
    private String submitUserName;

    /**
     * 提交人账号
     */
    private String submitWkNo;

    /**
     * 结束时间
     */
    private LocalDate endDate;

    /**
     * 任务单操作类型 
     */
    private Integer optType;

    /**
     * 匹配上线日期及模块的集成编译单ID
     */
    private String matchInteCompileTaskIds;

    /**
     * 附加指定模块下集成编译单
     */
    private String attachInteCompileTaskIds;

    private String customField1;

    private String customField2;

    private String customField3;

    private String customField4;

    private String customField5;

    /**
     * 任务单操作 历史已执行到的步骤
     */
    private Integer optStep;

    /**
     * 发布任务类型 1发布  2回退
     */
    private Integer taskType;

    /**
     * 回退清单列表 TASK_TYPE=1时使用
     */
    private String backArchiveFiles;

    private String compileTypeJson;

    /**
     * 是否灰度
     */
    private Integer isHd;

    private String moduleNames;

    private String archiveFilesCompare;

    private String appId;

    private BigDecimal objStatus;

    private LocalDateTime createDate;

    private String createUser;

    private LocalDateTime updateDate;

    private String updateUser;


}
