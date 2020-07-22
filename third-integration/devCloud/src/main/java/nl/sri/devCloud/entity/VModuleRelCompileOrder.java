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
public class VModuleRelCompileOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模块ID
     */
    private String moduleId;

    /**
     * 发布任务id
     */
    private String taskId;

    /**
     * 需求编号
     */
    private String taskReqNo;

    private Integer dealStatus;

    private Integer executeStatus;

    private String buildLog;

    private LocalDateTime endDate;

    private Integer purify;

    private Integer removeIntermediateFile;

    private Integer optType;

    private String customField1;

    private String customField2;

    private String customField3;

    private String customField4;

    private String customField5;

    /**
     * 目标文件多个以逗号分隔
     */
    private String targetList;

    /**
     * 是否自动测试（0：否，1：是）
     */
    private Integer autoTestFlag;

    private String appId;

    private BigDecimal objStatus;

    private LocalDateTime createDate;

    private String createUser;

    private LocalDateTime updateDate;

    private String updateUser;


}
