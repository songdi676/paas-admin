package nl.sri.devCloud.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class ZtEffort implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user;

    private String todo;

    private LocalDate date;

    private LocalDateTime begin;

    private LocalDateTime end;

    private String type;

    private Integer idvalue;

    private String name;

    private String desc;

    private String status;


}
