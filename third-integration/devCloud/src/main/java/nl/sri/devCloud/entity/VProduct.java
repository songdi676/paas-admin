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
public class VProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 父id
     */
    private String superId;

    /**
     * 虚拟部门
     */
    private String virtualDepartmentId;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 层级
     */
    private BigDecimal levelNum;

    /**
     * 排序
     */
    private BigDecimal sortNum;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 更新者
     */
    private String updateUser;

    /**
     * 数据有效性 0有效，1失效
     */
    private BigDecimal objStatus;

    /**
     * 产品描述
     */
    private String reqDesc;

    /**
     * 产品简称标识
     */
    private String shortMark;


}
