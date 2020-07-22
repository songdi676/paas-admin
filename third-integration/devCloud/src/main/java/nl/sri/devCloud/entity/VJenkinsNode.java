package nl.sri.devCloud.entity;

import java.math.BigDecimal;
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
public class VJenkinsNode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 1、集成编译  2、发布编译
     */
    private BigDecimal compileType;

    /**
     * 数据有效性 0有效，1失效
     */
    private BigDecimal objStatus;


}
