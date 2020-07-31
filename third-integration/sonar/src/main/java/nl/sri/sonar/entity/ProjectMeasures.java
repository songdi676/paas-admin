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
 * @since 2020-07-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProjectMeasures implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal value;

    private Integer metricId;

    private String textValue;

    private String alertStatus;

    private String alertText;

    private String description;

    private Integer personId;

    private BigDecimal variationValue1;

    private BigDecimal variationValue2;

    private BigDecimal variationValue3;

    private BigDecimal variationValue4;

    private BigDecimal variationValue5;

    private String measureData;

    private String componentUuid;

    private String analysisUuid;


}
