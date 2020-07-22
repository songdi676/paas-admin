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
@TableName("VIEWS")
public class Views implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("VIEW_DEFINITION")
    private String viewDefinition;

    @TableField("CHECK_OPTION")
    private String checkOption;

    @TableField("IS_UPDATABLE")
    private String isUpdatable;

    @TableField("DEFINER")
    private String definer;

    @TableField("SECURITY_TYPE")
    private String securityType;

    @TableField("CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @TableField("COLLATION_CONNECTION")
    private String collationConnection;


}
