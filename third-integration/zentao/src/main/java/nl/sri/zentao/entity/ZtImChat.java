package nl.sri.zentao.entity;

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
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtImChat implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String gid;

    private String name;

    private String type;

    private String admins;

    private String committers;

    private Integer subject;

    //private String public;

    @TableField("createdBy")
    private String createdBy;

    @TableField("createdDate")
    private LocalDateTime createdDate;

    @TableField("editedBy")
    private String editedBy;

    @TableField("editedDate")
    private LocalDateTime editedDate;

    @TableField("lastActiveTime")
    private LocalDateTime lastActiveTime;

    @TableField("dismissDate")
    private LocalDateTime dismissDate;


}
