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
@TableName("INNODB_SYS_TABLESTATS")
public class InnodbSysTablestats implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_ID")
    private Long tableId;

    @TableField("NAME")
    private String name;

    @TableField("STATS_INITIALIZED")
    private String statsInitialized;

    @TableField("NUM_ROWS")
    private Long numRows;

    @TableField("CLUST_INDEX_SIZE")
    private Long clustIndexSize;

    @TableField("OTHER_INDEX_SIZE")
    private Long otherIndexSize;

    @TableField("MODIFIED_COUNTER")
    private Long modifiedCounter;

    @TableField("AUTOINC")
    private Long autoinc;

    @TableField("REF_COUNT")
    private Integer refCount;


}
