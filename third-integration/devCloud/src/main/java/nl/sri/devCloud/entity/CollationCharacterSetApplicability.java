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
@TableName("COLLATION_CHARACTER_SET_APPLICABILITY")
public class CollationCharacterSetApplicability implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("COLLATION_NAME")
    private String collationName;

    @TableField("CHARACTER_SET_NAME")
    private String characterSetName;


}
