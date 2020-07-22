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
public class ZtConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private String owner;

    private String module;

    private String section;

    private String key;

    private String value;


}
