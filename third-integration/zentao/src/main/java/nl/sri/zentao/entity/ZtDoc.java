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
public class ZtDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer product;

    private Integer project;

    private String lib;

    private String module;

    private String title;

    private String keywords;

    private String type;

    private Integer views;

    private String collector;

    @TableField("addedBy")
    private String addedBy;

    @TableField("addedDate")
    private LocalDateTime addedDate;

    @TableField("editedBy")
    private String editedBy;

    @TableField("editedDate")
    private LocalDateTime editedDate;

    private String acl;

    private String groups;

    private String users;

    private Integer version;

    private String deleted;


}
