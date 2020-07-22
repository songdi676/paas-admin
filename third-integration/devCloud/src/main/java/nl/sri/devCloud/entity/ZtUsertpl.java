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
public class ZtUsertpl implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account;

    private String type;

    private String title;

    private String content;

    //private String public;


}
