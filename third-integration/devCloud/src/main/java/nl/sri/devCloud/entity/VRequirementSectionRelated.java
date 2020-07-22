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
public class VRequirementSectionRelated implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 阶段需求单id
     */
    private String requirementSectionId;

    /**
     * 关联需求阶段(用,分隔) 
     */
    private String relatedSections;

    /**
     * 是否影响五项考核
     */
    private BigDecimal isAffectFiveExamines;

    /**
     * 是否使用上线工具/上线工具是否测试
     */
    private BigDecimal isUseReleaseTool;

    /**
     * 业务变更说明
     */
    private String businessChangeDesc;

    /**
     * 业务需求描述
     */
    private String businessRequirementDesc;

    /**
     * 实现功能描述
     */
    private String actualizeDesc;

    /**
     * 项目在业务支撑系统中的位置
     */
    private String systemLocation;

    /**
     * 是否业务数据修改
     */
    private BigDecimal isDesginBusinessDataModi;

    /**
     * 影响CSP系统界面路径
     */
    private String cspSystemLocation;

    /**
     * 上线期间可能影响的子系统、业务/上线时间影响
     */
    private String releaseTimeAffect;

    /**
     * 上线后可能影响的子系统、业务/上线后影响
     */
    private String releasedAffect;

    /**
     * 是否可能影响月出账/影响评估 
     */
    private BigDecimal affectEvaluate;

    /**
     * 是否立即生效对外提供应用
     */
    private BigDecimal isBecomeEffective;

    /**
     * 测试用例数
     */
    private BigDecimal testUseCaseAmount;

    /**
     * 通过用例数
     */
    private BigDecimal testPassedCaseAmount;

    private BigDecimal objStatus;

    private LocalDateTime createTime;

    private String createUser;

    private LocalDateTime updateTime;

    private String updateUser;

    private String appId;


}
