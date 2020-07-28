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
public class ZtTaskestimate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer task;

    private LocalDate date;

    private Float left;

    private Float consumed;

    private String account;

    private String work;


}
