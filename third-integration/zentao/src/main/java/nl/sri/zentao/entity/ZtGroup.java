package nl.sri.zentao.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class ZtGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String role;

    @TableField("`desc`")
    private String desc;

    private String acl;


}
