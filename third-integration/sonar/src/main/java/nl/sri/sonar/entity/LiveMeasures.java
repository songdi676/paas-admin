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
public class LiveMeasures implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uuid;

    private String projectUuid;

    private String componentUuid;

    private Integer metricId;

    private BigDecimal value;

    private String textValue;

    private BigDecimal variation;

    private String measureData;

    private String updateMarker;

    private Long createdAt;

    private Long updatedAt;


}
