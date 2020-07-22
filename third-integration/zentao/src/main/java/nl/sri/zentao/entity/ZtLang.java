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
public class ZtLang implements Serializable {

    private static final long serialVersionUID = 1L;

    private String lang;

    private String module;

    private String section;

    private String key;

    private String value;

    private String system;


}
