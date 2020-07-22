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
@TableName("INNODB_FT_BEING_DELETED")
public class InnodbFtBeingDeleted implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DOC_ID")
    private Long docId;


}
