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
@TableName("PARTITIONS")
public class Partitions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("PARTITION_NAME")
    private String partitionName;

    @TableField("SUBPARTITION_NAME")
    private String subpartitionName;

    @TableField("PARTITION_ORDINAL_POSITION")
    private Long partitionOrdinalPosition;

    @TableField("SUBPARTITION_ORDINAL_POSITION")
    private Long subpartitionOrdinalPosition;

    @TableField("PARTITION_METHOD")
    private String partitionMethod;

    @TableField("SUBPARTITION_METHOD")
    private String subpartitionMethod;

    @TableField("PARTITION_EXPRESSION")
    private String partitionExpression;

    @TableField("SUBPARTITION_EXPRESSION")
    private String subpartitionExpression;

    @TableField("PARTITION_DESCRIPTION")
    private String partitionDescription;

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

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("CHECK_TIME")
    private LocalDateTime checkTime;

    @TableField("CHECKSUM")
    private Long checksum;

    @TableField("PARTITION_COMMENT")
    private String partitionComment;

    @TableField("NODEGROUP")
    private String nodegroup;

    @TableField("TABLESPACE_NAME")
    private String tablespaceName;


}
