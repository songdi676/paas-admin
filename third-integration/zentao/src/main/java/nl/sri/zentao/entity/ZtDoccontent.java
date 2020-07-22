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
public class ZtDoccontent implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer doc;

    private String title;

    private String digest;

    private String content;

    private String files;

    private String type;

    private Integer version;


}
