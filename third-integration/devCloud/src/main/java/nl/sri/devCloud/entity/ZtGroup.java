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
public class ZtGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String role;

    private String desc;

    private String acl;


}
