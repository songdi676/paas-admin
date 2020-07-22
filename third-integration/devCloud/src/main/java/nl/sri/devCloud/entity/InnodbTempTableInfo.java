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
@TableName("INNODB_TEMP_TABLE_INFO")
public class InnodbTempTableInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_ID")
    private Long tableId;

    @TableField("NAME")
    private String name;

    @TableField("N_COLS")
    private Integer nCols;

    @TableField("SPACE")
    private Integer space;

    @TableField("PER_TABLE_TABLESPACE")
    private String perTableTablespace;

    @TableField("IS_COMPRESSED")
    private String isCompressed;


}
