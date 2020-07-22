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
public class ZtSuitecase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer suite;

    private Integer product;

    //
    // private Integer case;

    private Integer version;


}
