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
@TableName("SCHEMA_PRIVILEGES")
public class SchemaPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("GRANTEE")
    private String grantee;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("PRIVILEGE_TYPE")
    private String privilegeType;

    @TableField("IS_GRANTABLE")
    private String isGrantable;


}
