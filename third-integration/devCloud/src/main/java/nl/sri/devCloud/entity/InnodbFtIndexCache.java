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
@TableName("INNODB_FT_INDEX_CACHE")
public class InnodbFtIndexCache implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("WORD")
    private String word;

    @TableField("FIRST_DOC_ID")
    private Long firstDocId;

    @TableField("LAST_DOC_ID")
    private Long lastDocId;

    @TableField("DOC_COUNT")
    private Long docCount;

    @TableField("DOC_ID")
    private Long docId;

    @TableField("POSITION")
    private Long position;


}
