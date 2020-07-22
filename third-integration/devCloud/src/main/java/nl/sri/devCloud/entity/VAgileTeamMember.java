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
public class VAgileTeamMember implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏捷团队成员序列
     */
    @TableField("SEQ_ID")
    private String seqId;

    /**
     * 敏捷团队ID
     */
    @TableField("TEAM_ID")
    private String teamId;

    /**
     * 成员ID
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 担任角色ID - PROJECTMEMBERGROUP
     */
    @TableField("GROUP_ID")
    private String groupId;

    @TableField("OBJ_STATUS")
    private BigDecimal objStatus;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("CREATE_USER")
    private String createUser;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 部门ID
     */
    @TableField("DEPT_ID")
    private String deptId;

    /**
     * 部门名称
     */
    @TableField("DEPT_NAME")
    private String deptName;


}
