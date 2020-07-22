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
@TableName("INNODB_SYS_COLUMNS")
public class InnodbSysColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_ID")
    private Long tableId;

    @TableField("NAME")
    private String name;

    @TableField("POS")
    private Long pos;

    @TableField("MTYPE")
    private Integer mtype;

    @TableField("PRTYPE")
    private Integer prtype;

    @TableField("LEN")
    private Integer len;


}
