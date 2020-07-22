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
@TableName("SESSION_STATUS")
public class SessionStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("VARIABLE_NAME")
    private String variableName;

    @TableField("VARIABLE_VALUE")
    private String variableValue;


}
