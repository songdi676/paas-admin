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
public class VModule implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模块名称
     */
    private String name;

    /**
     * 仓库id
     */
    private String repoConfigId;

    /**
     * app_id
     */
    private String appId;

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

    /**
     * 部门id
     */
    private String departmentId;

    /**
     * ftp id
     */
    private String ftpId;

    /**
     * 虚拟部门id
     */
    private String virtualDepartmentId;

    /**
     * 是否是sql模块（1：是，0：不是）
     */
    private Boolean isSqlModule;


}
