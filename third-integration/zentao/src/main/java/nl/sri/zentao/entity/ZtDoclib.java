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
public class ZtDoclib implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer project;

    private String name;

    private String acl;

    private String groups;

    private String users;

    private String main;

    private String collector;

    private Integer order;

    private String deleted;


}
