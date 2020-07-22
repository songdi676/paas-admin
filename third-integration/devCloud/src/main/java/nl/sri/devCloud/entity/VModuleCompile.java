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
public class VModuleCompile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 模块id
     */
    private String moduleId;

    /**
     * 编译主机id
     */
    private String jenkinsNodeId;

    /**
     * 触发方式（0:清单，1：定时，3：自动）
     */
    private Boolean triggerMode;

    /**
     * 触发规则
     */
    private String triggerRule;

    /**
     * 分支
     */
    private String branch;

    /**
     * 是否集成checkstyle（1：集成，0：不集成）
     */
    private Boolean interCheckstyle;

    /**
     * checkstyle的shell命令
     */
    private String shellCmdByCs;

    /**
     * checkstyle的结果文件路径
     */
    private String patternByCs;

    /**
     * checkstyle是否编译限制（1：是，0：否）
     */
    private Boolean limitByCs;

    /**
     * checkstyle的规则
     */
    private String chkParamByCs;

    /**
     * 是否集成构建配置（1：是，0：否）
     */
    private Boolean interConstruct;

    /**
     * 编译脚本路径
     */
    private String buildPath;

    /**
     * 编译脚本执行命令
     */
    private String buildCmd;

    /**
     * 工作路径
     */
    private String subsys;

    /**
     * 代码路径
     */
    private String srcPath;

    /**
     * 目标文件生成位置
     */
    private String objPath;

    /**
     * FTP到文件服务器的位置
     */
    private String targetDir;

    /**
     * 目标文件
     */
    private String targetList;

    /**
     * 目标程序列表
     */
    private String targetProgramList;

    /**
     * 更新脚本存放路径
     */
    private String updatePath;

    /**
     * 更新脚本执行命令
     */
    private String updateCmd;

    /**
     * 是否单独执行编译脚本（1：是，0：否）
     */
    private Boolean singleExcuteShell;

    /**
     * 邮件通知类型（1：构建成功，2：构建失败）多个以逗号分割
     */
    private String emailNoticeType;

    /**
     * 邮件主送对象
     */
    private String emailSendAddr;

    /**
     * 邮件抄送对象
     */
    private String emailCcAddr;

    /**
     * 是否集成findbugs（1：集成，0：不集成）
     */
    private Boolean interFindbugs;

    /**
     * findbugs的shell命令
     */
    private String shellCmdByFb;

    /**
     * findbugs的结果文件路径
     */
    private String patternByFb;

    /**
     * findbugs是否编译限制（1：是，0：否）
     */
    private Boolean limitByFb;

    /**
     * findbugs的规则
     */
    private String chkParamByFb;

    /**
     * 是否集成覆盖率（1：集成，0：不集成）
     */
    private Boolean interJacoco;

    /**
     * 覆盖率的shell命令
     */
    private String shellCmdByJacoco;

    /**
     * 覆盖率的结果文件路径
     */
    private String patternByJacoco;

    /**
     * 覆盖率的类文件路径
     */
    private String classByJacoco;

    /**
     * 覆盖率的源文件路径:
     */
    private String sourceByJacoco;

    /**
     * 覆盖率的包含源文件路径
     */
    private String sourceInclusionByJacoco;

    /**
     * 是否集成sonar（1：是，0：否）
     */
    private Boolean interSonar;

    /**
     * sonar是否并行（1：是，0：否）
     */
    private Boolean isSonar;

    /**
     * sonar是否管道（1：是，0：否）
     */
    private Boolean isSonarInCompile;

    /**
     * sonar jdk
     */
    private String sonarJdk;

    /**
     * sonar定时规则
     */
    private String timerSpecSingle;

    /**
     * sonar path
     */
    private String sonarProject;

    /**
     * sonar JVM Options
     */
    private String sonarJavaopts;

    /**
     * sonar properties
     */
    private String sonarProperty;

    /**
     * 流水线状态(0:关闭，1：执行)
     */
    private Boolean status;

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
     * sonarQube的Task to run
     */
    private String sonarTask;

    /**
     * sonarQube的Additional arguments
     */
    private String sonarArguments;

    /**
     * 检出名
     */
    private String checkoutName;

    /**
     * 拷贝路径
     */
    private String copyDir;

    /**
     * 反打标签脚本路径
     */
    private String newtagPath;

    /**
     * 反打标签脚本名
     */
    private String newtag;

    /**
     * 执行反打标签命令
     */
    private String newtagCmd;

    /**
     * 删除中间文件路径
     */
    private String removeFilePath;

    /**
     * 删除中间文件命令
     */
    private String removeFileCmd;

    /**
     * 关联集成编译节点ID
     */
    private String relaInteCompileType;

    /**
     * 获取基线路径地址
     */
    private String svnUrl;

    /**
     * 需求编号
     */
    private String reqNo;

    /**
     * 是否从集成单获得目标程序 0 否 1 是
     */
    private Boolean isIntegration;

    /**
     * 自动测试命令
     */
    private String autoTestCommand;

    /**
     * ftp id
     */
    private String ftpId;

    /**
     * 是否自动部署（1：是，0：否）
     */
    private Integer interDeploy;

    /**
     * 回归主送地址
     */
    private String releaseEmailSendAddr;

    /**
     * 回归抄送地址
     */
    private String releaseEmailCcAddr;

    /**
     * 是否自动测试（1：是，0：否）
     */
    private Integer interTest;

    /**
     * maven子模块名称
     */
    private String mvnSubModuleNames;

    /**
     * sonar标签
     */
    private String sonarLabel;


}
