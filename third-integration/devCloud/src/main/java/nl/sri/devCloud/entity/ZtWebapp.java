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
public class ZtWebapp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer appid;

    private Integer module;

    private String name;

    private String author;

    private String url;

    private String icon;

    private String target;

    private String size;

    //private String abstract;

    private String desc;

    @TableField("addedBy")
    private String addedBy;

    @TableField("addedDate")
    private LocalDateTime addedDate;

    @TableField("addType")
    private String addType;

    private Integer views;


}
