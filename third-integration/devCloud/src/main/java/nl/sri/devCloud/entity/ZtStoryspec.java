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
public class ZtStoryspec implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer story;

    private Integer version;

    private String title;

    private String spec;

    private String verify;


}
