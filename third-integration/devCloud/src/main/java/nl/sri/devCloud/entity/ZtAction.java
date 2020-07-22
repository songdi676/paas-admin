package nl.sri.devCloud.entity;

import java.time.LocalDateTime;
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
public class ZtAction implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("objectType")
    private String objectType;

    @TableField("objectID")
    private Integer objectID;

    private String product;

    private Integer project;

    private String actor;

    private String action;

    private LocalDateTime date;

    private String comment;

    private String extra;

    private String read;


}
