package nl.sri.devCloud.entity;

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
public class VModuleToTeam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 团队id
     */
    private String agileTeamId;

    /**
     * 模块id
     */
    private String moduleId;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新者
     */
    private String updateUser;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 数据有效性 0有效，1失效
     */
    private Integer objStatus;


}
