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
public class ZtCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String phone;

    private String fax;

    private String address;

    private String zipcode;

    private String website;

    private String backyard;

    private String guest;

    private String admins;

    private String deleted;


}
