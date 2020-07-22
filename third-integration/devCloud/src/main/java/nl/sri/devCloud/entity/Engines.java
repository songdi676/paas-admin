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
@TableName("ENGINES")
public class Engines implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ENGINE")
    private String engine;

    @TableField("SUPPORT")
    private String support;

    @TableField("COMMENT")
    private String comment;

    @TableField("TRANSACTIONS")
    private String transactions;

    @TableField("XA")
    private String xa;

    @TableField("SAVEPOINTS")
    private String savepoints;


}
