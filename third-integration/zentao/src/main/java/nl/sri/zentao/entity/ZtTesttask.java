package nl.sri.zentao.entity;

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
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtTesttask implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer product;

    private Integer project;

    private String build;

    private String owner;

    private Integer pri;

    private LocalDate begin;

    private LocalDate end;

    private String mailto;

    private String desc;

    private String report;

    private String status;

    private String deleted;


}
