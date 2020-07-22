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
@TableName("SCHEMATA")
public class Schemata implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CATALOG_NAME")
    private String catalogName;

    @TableField("SCHEMA_NAME")
    private String schemaName;

    @TableField("DEFAULT_CHARACTER_SET_NAME")
    private String defaultCharacterSetName;

    @TableField("DEFAULT_COLLATION_NAME")
    private String defaultCollationName;

    @TableField("SQL_PATH")
    private String sqlPath;


}
