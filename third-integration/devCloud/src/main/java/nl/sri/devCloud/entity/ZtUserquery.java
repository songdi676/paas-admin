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
public class ZtUserquery implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account;

    private String module;

    private String title;

    private String form;

    private String sql;

    private String shortcut;


}
