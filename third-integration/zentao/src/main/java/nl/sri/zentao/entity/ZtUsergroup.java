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
public class ZtUsergroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account;

    private Integer group;


}
