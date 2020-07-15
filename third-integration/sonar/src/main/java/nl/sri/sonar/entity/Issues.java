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
 * @since 2020-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Issues implements Serializable {

    private static final long serialVersionUID = 1L;

    private String kee;

    private Integer ruleId;

    private String severity;

    private Boolean manualSeverity;

    private String message;

    private Integer line;

    private BigDecimal gap;

    private String status;

    private String resolution;

    private String checksum;

    private String reporter;

    private String assignee;

    private String authorLogin;

    private String actionPlanKey;

    private String issueAttributes;

    private Integer effort;

    private Long createdAt;

    private Long updatedAt;

    private Long issueCreationDate;

    private Long issueUpdateDate;

    private Long issueCloseDate;

    private String tags;

    private String componentUuid;

    private String projectUuid;

    private String locations;

    private Integer issueType;

    private Boolean fromHotspot;


}
