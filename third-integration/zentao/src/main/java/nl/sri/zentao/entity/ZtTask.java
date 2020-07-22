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
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer parent;

    private Integer project;

    private Integer module;

    private Integer story;

    @TableField("storyVersion")
    private Integer storyVersion;

    @TableField("fromBug")
    private Integer fromBug;

    private String name;

    private String type;

    private Integer pri;

    private Float estimate;

    private Float consumed;

    @TableField("`left`")
    private Float left;

    @TableField("`deadline`")
    private LocalDate deadline;

    private String status;

    private String color;

    private String mailto;

    @TableField("`desc`")
    private String desc;

    @TableField("openedBy")
    private String openedBy;

    @TableField("openedDate")
    private LocalDateTime openedDate;

    @TableField("assignedTo")
    private String assignedTo;

    @TableField("assignedDate")
    private LocalDateTime assignedDate;

    @TableField("estStarted")
    private LocalDate estStarted;

    @TableField("realStarted")
    private LocalDate realStarted;

    @TableField("finishedBy")
    private String finishedBy;

    @TableField("finishedDate")
    private LocalDateTime finishedDate;

    @TableField("canceledBy")
    private String canceledBy;

    @TableField("canceledDate")
    private LocalDateTime canceledDate;

    @TableField("closedBy")
    private String closedBy;

    @TableField("closedDate")
    private LocalDateTime closedDate;

    @TableField("closedReason")
    private String closedReason;

    @TableField("lastEditedBy")
    private String lastEditedBy;

    @TableField("lastEditedDate")
    private LocalDateTime lastEditedDate;

    private String deleted;


}
