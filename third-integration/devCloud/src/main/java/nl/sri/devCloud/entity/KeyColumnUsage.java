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
@TableName("KEY_COLUMN_USAGE")
public class KeyColumnUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @TableField("CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @TableField("CONSTRAINT_NAME")
    private String constraintName;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("COLUMN_NAME")
    private String columnName;

    @TableField("ORDINAL_POSITION")
    private Long ordinalPosition;

    @TableField("POSITION_IN_UNIQUE_CONSTRAINT")
    private Long positionInUniqueConstraint;

    @TableField("REFERENCED_TABLE_SCHEMA")
    private String referencedTableSchema;

    @TableField("REFERENCED_TABLE_NAME")
    private String referencedTableName;

    @TableField("REFERENCED_COLUMN_NAME")
    private String referencedColumnName;


}
