package nl.sri.devCloud.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtProjectstory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer project;

    private Integer product;

    private Integer story;

    private Integer version;

    private Integer order;


}
