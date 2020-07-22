package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class VColumnConfigValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("APP_ID")
    private Integer appId;

    @TableField("COLUMN_NAME")
    private Integer columnName;

    @TableField("RECORD_ID")
    private Integer recordId;

    @TableField("COLUMN_VALUE")
    private Integer columnValue;


}
