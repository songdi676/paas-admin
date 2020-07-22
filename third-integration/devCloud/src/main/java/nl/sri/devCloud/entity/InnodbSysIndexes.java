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
@TableName("INNODB_SYS_INDEXES")
public class InnodbSysIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("INDEX_ID")
    private Long indexId;

    @TableField("NAME")
    private String name;

    @TableField("TABLE_ID")
    private Long tableId;

    @TableField("TYPE")
    private Integer type;

    @TableField("N_FIELDS")
    private Integer nFields;

    @TableField("PAGE_NO")
    private Integer pageNo;

    @TableField("SPACE")
    private Integer space;

    @TableField("MERGE_THRESHOLD")
    private Integer mergeThreshold;


}
