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
public class ZtHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer action;

    private String field;

    private String old;

    //private String new;

    private String diff;


}
