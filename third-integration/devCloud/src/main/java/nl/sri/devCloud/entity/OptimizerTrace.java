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
@TableName("OPTIMIZER_TRACE")
public class OptimizerTrace implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("QUERY")
    private String query;

    @TableField("TRACE")
    private String trace;

    @TableField("MISSING_BYTES_BEYOND_MAX_MEM_SIZE")
    private Integer missingBytesBeyondMaxMemSize;

    @TableField("INSUFFICIENT_PRIVILEGES")
    private Boolean insufficientPrivileges;


}
