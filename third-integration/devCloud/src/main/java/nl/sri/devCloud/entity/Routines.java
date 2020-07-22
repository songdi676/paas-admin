package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ROUTINES")
public class Routines implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SPECIFIC_NAME")
    private String specificName;

    @TableField("ROUTINE_CATALOG")
    private String routineCatalog;

    @TableField("ROUTINE_SCHEMA")
    private String routineSchema;

    @TableField("ROUTINE_NAME")
    private String routineName;

    @TableField("ROUTINE_TYPE")
    private String routineType;

    @TableField("DATA_TYPE")
    private String dataType;

    @TableField("CHARACTER_MAXIMUM_LENGTH")
    private Integer characterMaximumLength;

    @TableField("CHARACTER_OCTET_LENGTH")
    private Integer characterOctetLength;

    @TableField("NUMERIC_PRECISION")
    private Long numericPrecision;

    @TableField("NUMERIC_SCALE")
    private Integer numericScale;

    @TableField("DATETIME_PRECISION")
    private Long datetimePrecision;

    @TableField("CHARACTER_SET_NAME")
    private String characterSetName;

    @TableField("COLLATION_NAME")
    private String collationName;

    @TableField("DTD_IDENTIFIER")
    private String dtdIdentifier;

    @TableField("ROUTINE_BODY")
    private String routineBody;

    @TableField("ROUTINE_DEFINITION")
    private String routineDefinition;

    @TableField("EXTERNAL_NAME")
    private String externalName;

    @TableField("EXTERNAL_LANGUAGE")
    private String externalLanguage;

    @TableField("PARAMETER_STYLE")
    private String parameterStyle;

    @TableField("IS_DETERMINISTIC")
    private String isDeterministic;

    @TableField("SQL_DATA_ACCESS")
    private String sqlDataAccess;

    @TableField("SQL_PATH")
    private String sqlPath;

    @TableField("SECURITY_TYPE")
    private String securityType;

    @TableField("CREATED")
    private LocalDateTime created;

    @TableField("LAST_ALTERED")
    private LocalDateTime lastAltered;

    @TableField("SQL_MODE")
    private String sqlMode;

    @TableField("ROUTINE_COMMENT")
    private String routineComment;

    @TableField("DEFINER")
    private String definer;

    @TableField("CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @TableField("COLLATION_CONNECTION")
    private String collationConnection;

    @TableField("DATABASE_COLLATION")
    private String databaseCollation;


}
