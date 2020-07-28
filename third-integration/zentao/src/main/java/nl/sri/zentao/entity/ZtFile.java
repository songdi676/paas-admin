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
public class ZtFile implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String pathname;

    private String title;

    private String extension;

    private Integer size;

    @TableField("objectType")
    private String objectType;

    @TableField("objectID")
    private Integer objectID;

    @TableField("addedBy")
    private String addedBy;

    @TableField("addedDate")
    private LocalDateTime addedDate;

    private Integer downloads;

    private String extra;

    private String deleted;


}
