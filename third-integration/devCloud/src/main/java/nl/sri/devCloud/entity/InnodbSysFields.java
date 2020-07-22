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
@TableName("INNODB_SYS_FIELDS")
public class InnodbSysFields implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("INDEX_ID")
    private Long indexId;

    @TableField("NAME")
    private String name;

    @TableField("POS")
    private Integer pos;


}
