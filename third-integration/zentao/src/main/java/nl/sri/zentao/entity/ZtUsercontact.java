package nl.sri.zentao.entity;

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
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtUsercontact implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String account;

    @TableField("listName")
    private String listName;

    @TableField("userList")
    private String userList;


}
