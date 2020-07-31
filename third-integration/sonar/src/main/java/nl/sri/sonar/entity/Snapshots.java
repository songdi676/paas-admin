package nl.sri.sonar.entity;

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
public class Snapshots implements Serializable {

    private static final long serialVersionUID = 1L;

    private String status;

    private Boolean islast;

    private String version;

    private Integer purgeStatus;

    private String period1Mode;

    private String period1Param;

    private String period2Mode;

    private String period2Param;

    private String period3Mode;

    private String period3Param;

    private String period4Mode;

    private String period4Param;

    private String period5Mode;

    private String period5Param;

    private Long createdAt;

    private Long buildDate;

    private Long period1Date;

    private Long period2Date;

    private Long period3Date;

    private Long period4Date;

    private Long period5Date;

    private String componentUuid;

    private String uuid;

    private String buildString;

    private String revision;


}
