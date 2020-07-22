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
@TableName("TABLESPACES")
public class Tablespaces implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLESPACE_NAME")
    private String tablespaceName;

    @TableField("ENGINE")
    private String engine;

    @TableField("TABLESPACE_TYPE")
    private String tablespaceType;

    @TableField("LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @TableField("EXTENT_SIZE")
    private Long extentSize;

    @TableField("AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @TableField("MAXIMUM_SIZE")
    private Long maximumSize;

    @TableField("NODEGROUP_ID")
    private Long nodegroupId;

    @TableField("TABLESPACE_COMMENT")
    private String tablespaceComment;


}
