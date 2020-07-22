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
@TableName("STATISTICS")
public class Statistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_CATALOG")
    private String tableCatalog;

    @TableField("TABLE_SCHEMA")
    private String tableSchema;

    @TableField("TABLE_NAME")
    private String tableName;

    @TableField("NON_UNIQUE")
    private Long nonUnique;

    @TableField("INDEX_SCHEMA")
    private String indexSchema;

    @TableField("INDEX_NAME")
    private String indexName;

    @TableField("SEQ_IN_INDEX")
    private Long seqInIndex;

    @TableField("COLUMN_NAME")
    private String columnName;

    @TableField("COLLATION")
    private String collation;

    @TableField("CARDINALITY")
    private Long cardinality;

    @TableField("SUB_PART")
    private Long subPart;

    @TableField("PACKED")
    private String packed;

    @TableField("NULLABLE")
    private String nullable;

    @TableField("INDEX_TYPE")
    private String indexType;

    @TableField("COMMENT")
    private String comment;

    @TableField("INDEX_COMMENT")
    private String indexComment;


}
