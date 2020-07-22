package nl.sri.devCloud.entity;

import java.time.LocalDate;
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
public class ZtProductplan implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer branch;

    private String title;

    private String desc;

    private LocalDate begin;

    private LocalDate end;

    private String order;

    private String deleted;


}
