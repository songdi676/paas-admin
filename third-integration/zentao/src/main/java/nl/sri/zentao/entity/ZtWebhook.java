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
public class ZtWebhook implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String type;

    private String name;

    private String url;

    private String domain;

    @TableField("contentType")
    private String contentType;

    @TableField("sendType")
    private String sendType;

    private String products;

    private String projects;

    private String params;

    private String actions;

    private String desc;

    @TableField("createdBy")
    private String createdBy;

    @TableField("createdDate")
    private LocalDateTime createdDate;

    @TableField("editedBy")
    private String editedBy;

    @TableField("editedDate")
    private LocalDateTime editedDate;

    private String deleted;


}
