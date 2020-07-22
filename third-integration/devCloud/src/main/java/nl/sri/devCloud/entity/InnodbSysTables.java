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
@TableName("INNODB_SYS_TABLES")
public class InnodbSysTables implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_ID")
    private Long tableId;

    @TableField("NAME")
    private String name;

    @TableField("FLAG")
    private Integer flag;

    @TableField("N_COLS")
    private Integer nCols;

    @TableField("SPACE")
    private Integer space;

    @TableField("FILE_FORMAT")
    private String fileFormat;

    @TableField("ROW_FORMAT")
    private String rowFormat;

    @TableField("ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @TableField("SPACE_TYPE")
    private String spaceType;


}
