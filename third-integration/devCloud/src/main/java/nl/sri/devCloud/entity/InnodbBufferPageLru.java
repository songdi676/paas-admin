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
@TableName("INNODB_BUFFER_PAGE_LRU")
public class InnodbBufferPageLru implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("POOL_ID")
    private Long poolId;

    @TableField("LRU_POSITION")
    private Long lruPosition;

    @TableField("SPACE")
    private Long space;

    @TableField("PAGE_NUMBER")
    private Long pageNumber;

    @TableField("PAGE_TYPE")
    private String pageType;

    @TableField("FLUSH_TYPE")
    private Long flushType;

    @TableField("FIX_COUNT")
    private Long fixCount;

    @TableField("IS_HASHED")
    private String isHashed;

    @TableField("NEWEST_MODIFICATION")
    private Long newestModification;

    @TableField("OLDEST_MODIFICATION")
    private Long oldestModification;

    @TableField("ACCESS_TIME")
    private Long accessTime;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("INDEX_NAME")
    private String indexName;

    @TableField("NUMBER_RECORDS")
    private Long numberRecords;

    @TableField("DATA_SIZE")
    private Long dataSize;

    @TableField("COMPRESSED_SIZE")
    private Long compressedSize;

    @TableField("COMPRESSED")
    private String compressed;

    @TableField("IO_FIX")
    private String ioFix;

    @TableField("IS_OLD")
    private String isOld;

    @TableField("FREE_PAGE_CLOCK")
    private Long freePageClock;


}
