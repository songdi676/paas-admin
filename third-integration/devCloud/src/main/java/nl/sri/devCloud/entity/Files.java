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
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("FILES")
public class Files implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("FILE_ID")
    private Long fileId;

    @TableField("FILE_NAME")
    private String fileName;

    @TableField("FILE_TYPE")
    private String fileType;

    @TableField("TABLESPACE_NAME")
    private String tablespaceName;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @TableField("LOGFILE_GROUP_NUMBER")
    private Long logfileGroupNumber;

    @TableField("ENGINE")
    private String engine;

    @TableField("FULLTEXT_KEYS")
    private String fulltextKeys;

    @TableField("DELETED_ROWS")
    private Long deletedRows;

    @TableField("UPDATE_COUNT")
    private Long updateCount;

    @TableField("FREE_EXTENTS")
    private Long freeExtents;

    @TableField("TOTAL_EXTENTS")
    private Long totalExtents;

    @TableField("EXTENT_SIZE")
    private Long extentSize;

    @TableField("INITIAL_SIZE")
    private Long initialSize;

    @TableField("MAXIMUM_SIZE")
    private Long maximumSize;

    @TableField("AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @TableField("CREATION_TIME")
    private LocalDateTime creationTime;

    @TableField("LAST_UPDATE_TIME")
    private LocalDateTime lastUpdateTime;

    @TableField("LAST_ACCESS_TIME")
    private LocalDateTime lastAccessTime;

    @TableField("RECOVER_TIME")
    private Long recoverTime;

    @TableField("TRANSACTION_COUNTER")
    private Long transactionCounter;

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

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("CHECK_TIME")
    private LocalDateTime checkTime;

    @TableField("CHECKSUM")
    private Long checksum;

    @TableField("STATUS")
    private String status;

    @TableField("EXTRA")
    private String extra;


}
