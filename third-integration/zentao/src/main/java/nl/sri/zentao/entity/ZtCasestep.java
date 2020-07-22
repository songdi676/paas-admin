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
public class ZtCasestep implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer parent;

    //private Integer case;

    private Integer version;

    private String type;

    private String desc;

    private String expect;


}
