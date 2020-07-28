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
public class ZtModule implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer root;

    private Integer branch;

    private String name;

    private Integer parent;

    private String path;

    private Integer grade;

    private Integer order;

    private String type;

    private String owner;

    private String collector;

    //private String short;

    private String deleted;


}
