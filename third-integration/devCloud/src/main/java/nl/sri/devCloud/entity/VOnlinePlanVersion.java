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
public class VOnlinePlanVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计划名称
     */
    private String 上线计划;

    /**
     * 上线日
     */
    private LocalDate 上线日期;

    private String 版本状态;

    /**
     * 版本号
     */
    private String 版本;

    @TableField("VERSION_ID")
    private String versionId;

    /**
     * 上线计划
     */
    @TableField("ONLINE_PLAN_ID")
    private String onlinePlanId;

    /**
     * 上线日
     */
    @TableField("ONLINE_DATE")
    private LocalDate onlineDate;

    /**
     * 基线标识
     */
    @TableField("BASELINE")
    private BigDecimal baseline;

    /**
     * 版本号
     */
    @TableField("VERSION_CODE")
    private String versionCode;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("UPDATE_USER")
    private String updateUser;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CREATE_USER")
    private String createUser;


}
