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
public class VModuleCompileOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流水线id
     */
    private String moduleCompileId;

    /**
     * 编译日志
     */
    private String buildLog;

    /**
     * 编译结束的时间
     */
    private LocalDateTime buildEndDate;

    /**
     * 执行状态（0：正在执行1：结束2：中断3：超时）
     */
    private Boolean executeStatus;

    /**
     * jenkins的编译序号
     */
    private Integer jenkinsBuildNum;

    private BigDecimal objStatus;

    private LocalDateTime createDate;

    private String createUser;

    private LocalDateTime updateDate;

    private String updateUser;

    /**
     * checkstyle执行结果（1：成功，0：失败）
     */
    private Boolean ckResult;

    /**
     * 编译执行结果（1：成功，0：失败）
     */
    private Boolean buildResult;

    /**
     * 集成编译任务id
     */
    private String inteCompileTaskId;

    /**
     * 是否是集成编译的order（1：是，0：否）
     */
    private Boolean isInterTask;

    /**
     * 运行状态(1:更新中，2：编译中，3：FTP中，4：更新失败，5：编译失败，6：FTP失败，7：FTP结束，8：代码质量校验失败，9：代码质量校验成功，10：代码质量校验执行中)
     */
    private Integer operatingStatus;

    /**
     * 部署结果（1：成功，0：失败）
     */
    private Integer deployResult;

    /**
     * 目标程序列表
     */
    private String targetProgramList;

    /**
     * 源代码修改说明
     */
    private String mark;

    /**
     * 编译清单
     */
    private String archiveFiles;

    /**
     * 测试状态，0未开始1成功2失败3执行中
     */
    private Integer testResult;


}
