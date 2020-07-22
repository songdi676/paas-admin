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
@TableName("INNODB_BUFFER_POOL_STATS")
public class InnodbBufferPoolStats implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("POOL_ID")
    private Long poolId;

    @TableField("POOL_SIZE")
    private Long poolSize;

    @TableField("FREE_BUFFERS")
    private Long freeBuffers;

    @TableField("DATABASE_PAGES")
    private Long databasePages;

    @TableField("OLD_DATABASE_PAGES")
    private Long oldDatabasePages;

    @TableField("MODIFIED_DATABASE_PAGES")
    private Long modifiedDatabasePages;

    @TableField("PENDING_DECOMPRESS")
    private Long pendingDecompress;

    @TableField("PENDING_READS")
    private Long pendingReads;

    @TableField("PENDING_FLUSH_LRU")
    private Long pendingFlushLru;

    @TableField("PENDING_FLUSH_LIST")
    private Long pendingFlushList;

    @TableField("PAGES_MADE_YOUNG")
    private Long pagesMadeYoung;

    @TableField("PAGES_NOT_MADE_YOUNG")
    private Long pagesNotMadeYoung;

    @TableField("PAGES_MADE_YOUNG_RATE")
    private Double pagesMadeYoungRate;

    @TableField("PAGES_MADE_NOT_YOUNG_RATE")
    private Double pagesMadeNotYoungRate;

    @TableField("NUMBER_PAGES_READ")
    private Long numberPagesRead;

    @TableField("NUMBER_PAGES_CREATED")
    private Long numberPagesCreated;

    @TableField("NUMBER_PAGES_WRITTEN")
    private Long numberPagesWritten;

    @TableField("PAGES_READ_RATE")
    private Double pagesReadRate;

    @TableField("PAGES_CREATE_RATE")
    private Double pagesCreateRate;

    @TableField("PAGES_WRITTEN_RATE")
    private Double pagesWrittenRate;

    @TableField("NUMBER_PAGES_GET")
    private Long numberPagesGet;

    @TableField("HIT_RATE")
    private Long hitRate;

    @TableField("YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long youngMakePerThousandGets;

    @TableField("NOT_YOUNG_MAKE_PER_THOUSAND_GETS")
    private Long notYoungMakePerThousandGets;

    @TableField("NUMBER_PAGES_READ_AHEAD")
    private Long numberPagesReadAhead;

    @TableField("NUMBER_READ_AHEAD_EVICTED")
    private Long numberReadAheadEvicted;

    @TableField("READ_AHEAD_RATE")
    private Double readAheadRate;

    @TableField("READ_AHEAD_EVICTED_RATE")
    private Double readAheadEvictedRate;

    @TableField("LRU_IO_TOTAL")
    private Long lruIoTotal;

    @TableField("LRU_IO_CURRENT")
    private Long lruIoCurrent;

    @TableField("UNCOMPRESS_TOTAL")
    private Long uncompressTotal;

    @TableField("UNCOMPRESS_CURRENT")
    private Long uncompressCurrent;


}
