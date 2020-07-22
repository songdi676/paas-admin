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
public class ZtDept implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer parent;

    private String path;

    private Integer grade;

    private Integer order;

    private String position;

    private String function;

    private String manager;


}
