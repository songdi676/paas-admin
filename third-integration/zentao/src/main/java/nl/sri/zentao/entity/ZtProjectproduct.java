package nl.sri.zentao.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtProjectproduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer project;

    private Integer product;

    private Integer branch;

    private Integer plan;


}
