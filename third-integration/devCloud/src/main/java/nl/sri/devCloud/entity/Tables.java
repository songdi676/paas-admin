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
@TableName("TABLES")
public class Tables implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("TABLE_TYPE")
    private String tableType;

    @TableField("ENGINE")
    private String engine;

    @TableField("VERSION")
    private Long version;

    @TableField("ROW_FORMAT")
    private String rowFormat;

    @TableField("TABLE_ROWS")
    private Long tableRows;

    @TableField("AVG_ROW_LENGTH")
    private Long avgRowLength;

    @TableField("DATA_LENGTH")
    private Long dataLength;

    @TableField("MAX_DATA_LENGTH")
    private Long maxDataLength;

    @TableField("INDEX_LENGTH")
    private Long indexLength;

    @TableField("DATA_FREE")
    private Long dataFree;

    @TableField("AUTO_INCREMENT")
    private Long autoIncrement;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("CHECK_TIME")
    private LocalDateTime checkTime;

    @TableField("TABLE_COLLATION")
    private String tableCollation;

    @TableField("CHECKSUM")
    private Long checksum;

    @TableField("CREATE_OPTIONS")
    private String createOptions;

    @TableField("TABLE_COMMENT")
    private String tableComment;


}
