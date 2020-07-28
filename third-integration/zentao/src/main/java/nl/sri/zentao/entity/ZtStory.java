package nl.sri.zentao.entity;

import java.time.LocalDate;
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
public class ZtStory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer product;

    private Integer branch;

    private Integer module;

    private String plan;

    private String source;

    @TableField("sourceNote")
    private String sourceNote;

    @TableField("fromBug")
    private Integer fromBug;

    private String title;

    private String keywords;

    private String type;

    private Integer pri;

    private Float estimate;

    private String status;

    private String color;

    private String stage;

    private String mailto;

    @TableField("openedBy")
    private String openedBy;

    @TableField("openedDate")
    private LocalDateTime openedDate;

    @TableField("assignedTo")
    private String assignedTo;

    @TableField("assignedDate")
    private LocalDateTime assignedDate;

    @TableField("lastEditedBy")
    private String lastEditedBy;

    @TableField("lastEditedDate")
    private LocalDateTime lastEditedDate;

    @TableField("reviewedBy")
    private String reviewedBy;

    @TableField("reviewedDate")
    private LocalDate reviewedDate;

    @TableField("closedBy")
    private String closedBy;

    @TableField("closedDate")
    private LocalDateTime closedDate;

    @TableField("closedReason")
    private String closedReason;

    @TableField("toBug")
    private Integer toBug;

    @TableField("childStories")
    private String childStories;

    @TableField("linkStories")
    private String linkStories;

    @TableField("duplicateStory")
    private Integer duplicateStory;

    private Integer version;

    private String deleted;


}
