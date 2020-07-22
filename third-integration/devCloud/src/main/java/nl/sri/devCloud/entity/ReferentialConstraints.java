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
@TableName("REFERENTIAL_CONSTRAINTS")
public class ReferentialConstraints implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @TableField("CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @TableField("CONSTRAINT_NAME")
    private String constraintName;

    @TableField("UNIQUE_CONSTRAINT_CATALOG")
    private String uniqueConstraintCatalog;

    @TableField("UNIQUE_CONSTRAINT_SCHEMA")
    private String uniqueConstraintSchema;

    @TableField("UNIQUE_CONSTRAINT_NAME")
    private String uniqueConstraintName;

    @TableField("MATCH_OPTION")
    private String matchOption;

    @TableField("UPDATE_RULE")
    private String updateRule;

    @TableField("DELETE_RULE")
    private String deleteRule;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("REFERENCED_TABLE_NAME")
    private String referencedTableName;


}
