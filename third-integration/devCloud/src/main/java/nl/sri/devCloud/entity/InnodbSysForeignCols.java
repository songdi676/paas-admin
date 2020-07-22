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
@TableName("INNODB_SYS_FOREIGN_COLS")
public class InnodbSysForeignCols implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("FOR_COL_NAME")
    private String forColName;

    @TableField("REF_COL_NAME")
    private String refColName;

    @TableField("POS")
    private Integer pos;


}
