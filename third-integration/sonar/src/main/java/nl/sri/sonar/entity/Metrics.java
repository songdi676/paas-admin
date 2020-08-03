package nl.sri.sonar.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author songdi
 * @since 2020-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Metrics implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String description;

    private Integer direction;

    private String domain;

    private String shortName;

    private Boolean qualitative;

    private String valType;

    private Boolean userManaged;

    private Boolean enabled;

    private BigDecimal worstValue;

    private BigDecimal bestValue;

    private Boolean optimizedBestValue;

    private Boolean hidden;

    private Boolean deleteHistoricalData;

    private Integer decimalScale;


}
