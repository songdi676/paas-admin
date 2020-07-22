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
@TableName("INNODB_SYS_VIRTUAL")
public class InnodbSysVirtual implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TABLE_ID")
    private Long tableId;

    @TableField("POS")
    private Integer pos;

    @TableField("BASE_POS")
    private Integer basePos;


}
