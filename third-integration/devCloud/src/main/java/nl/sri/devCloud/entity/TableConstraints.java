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
@TableName("TABLE_CONSTRAINTS")
public class TableConstraints implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CONSTRAINT_CATALOG")
    private String constraintCatalog;

    @TableField("CONSTRAINT_SCHEMA")
    private String constraintSchema;

    @TableField("CONSTRAINT_NAME")
    private String constraintName;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("CONSTRAINT_TYPE")
    private String constraintType;


}
