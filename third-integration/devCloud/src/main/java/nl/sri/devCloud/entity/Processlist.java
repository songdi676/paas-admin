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
@TableName("PROCESSLIST")
public class Processlist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("USER")
    private String user;

    @TableField("HOST")
    private String host;

    @TableField("DB")
    private String db;

    @TableField("COMMAND")
    private String command;

    @TableField("TIME")
    private Integer time;

    @TableField("STATE")
    private String state;

    @TableField("INFO")
    private String info;


}
