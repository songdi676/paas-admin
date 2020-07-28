package nl.sri.zentao.entity;

import java.math.BigDecimal;
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
public class ZtTeam implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer root;

    private String type;

    private String account;

    private String role;

    private String limited;

    private LocalDate join;

    private Integer days;

    private Float hours;

    private BigDecimal estimate;

    private BigDecimal consumed;

    private BigDecimal left;

    private Integer order;


}
