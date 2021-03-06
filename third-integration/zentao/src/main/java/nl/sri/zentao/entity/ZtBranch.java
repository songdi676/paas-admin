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
public class ZtBranch implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer product;

    private String name;

    private Integer order;

    private String deleted;


}
