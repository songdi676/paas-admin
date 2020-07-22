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
@TableName("CHARACTER_SETS")
public class CharacterSets implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CHARACTER_SET_NAME")
    private String characterSetName;

    @TableField("DEFAULT_COLLATE_NAME")
    private String defaultCollateName;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("MAXLEN")
    private Long maxlen;


}
