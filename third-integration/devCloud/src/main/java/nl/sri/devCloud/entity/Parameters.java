package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("PARAMETERS")
public class Parameters implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SPECIFIC_CATALOG")
    private String specificCatalog;

    @TableField("SPECIFIC_SCHEMA")
    private String specificSchema;

    @TableField("SPECIFIC_NAME")
    private String specificName;

    @TableField("ORDINAL_POSITION")
    private Integer ordinalPosition;

    @TableField("PARAMETER_MODE")
    private String parameterMode;

    @TableField("PARAMETER_NAME")
    private String parameterName;

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

    @TableField("ROUTINE_TYPE")
    private String routineType;


}
