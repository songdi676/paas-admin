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
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("COLUMN_PRIVILEGES")
public class ColumnPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("GRANTEE")
    private String grantee;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("COLUMN_NAME")
    private String columnName;

    @TableField("PRIVILEGE_TYPE")
    private String privilegeType;

    @TableField("IS_GRANTABLE")
    private String isGrantable;


}
