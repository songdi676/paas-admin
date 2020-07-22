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
@TableName("INNODB_SYS_TABLESPACES")
public class InnodbSysTablespaces implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("SPACE")
    private Integer space;

    @TableField("NAME")
    private String name;

    @TableField("FLAG")
    private Integer flag;

    @TableField("FILE_FORMAT")
    private String fileFormat;

    @TableField("ROW_FORMAT")
    private String rowFormat;

    @TableField("PAGE_SIZE")
    private Integer pageSize;

    @TableField("ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @TableField("SPACE_TYPE")
    private String spaceType;

    @TableField("FS_BLOCK_SIZE")
    private Integer fsBlockSize;

    @TableField("FILE_SIZE")
    private Long fileSize;

    @TableField("ALLOCATED_SIZE")
    private Long allocatedSize;


}
