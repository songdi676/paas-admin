package nl.sri.sonar.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;

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
public class Projects implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String description;

    private Boolean enabled;

    private String scope;

    private String qualifier;

    private String kee;

    private String language;

    private String longName;

    private LocalDateTime createdAt;

    private String path;

    private String deprecatedKee;

    private String uuid;

    private String projectUuid;

    private String moduleUuid;

    private String moduleUuidPath;

    private Long authorizationUpdatedAt;

    private String rootUuid;

    private String copyComponentUuid;

    private String developerUuid;

    private String uuidPath;

    private Boolean bChanged;

    private String bCopyComponentUuid;

    private String bDescription;

    private Boolean bEnabled;

    private String bLanguage;

    private String bLongName;

    private String bModuleUuid;

    private String bModuleUuidPath;

    private String bName;

    private String bPath;

    private String bQualifier;

    private String bUuidPath;

    private String organizationUuid;

    private String tags;
    @TableField("private")
    private Boolean privated;

    private String mainBranchProjectUuid;

}
