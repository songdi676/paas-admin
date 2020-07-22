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
public class ZtBug implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer branch;

    private Integer module;

    private Integer project;

    private Integer plan;

    private Integer story;

    @TableField("storyVersion")
    private Integer storyVersion;

    private Integer task;

    @TableField("toTask")
    private Integer toTask;

    @TableField("toStory")
    private Integer toStory;

    private String title;

    private String keywords;

    private Integer severity;

    private Integer pri;

    private String type;

    private String os;

    private String browser;

    private String hardware;

    private String found;

    private String steps;

    private String status;

    private String color;

    private Boolean confirmed;

    @TableField("activatedCount")
    private Integer activatedCount;

    @TableField("activatedDate")
    private LocalDateTime activatedDate;

    private String mailto;

    @TableField("openedBy")
    private String openedBy;

    @TableField("openedDate")
    private LocalDateTime openedDate;

    @TableField("openedBuild")
    private String openedBuild;

    @TableField("assignedTo")
    private String assignedTo;

    @TableField("assignedDate")
    private LocalDateTime assignedDate;

    private LocalDate deadline;

    @TableField("resolvedBy")
    private String resolvedBy;

    private String resolution;

    @TableField("resolvedBuild")
    private String resolvedBuild;

    @TableField("resolvedDate")
    private LocalDateTime resolvedDate;

    @TableField("closedBy")
    private String closedBy;

    @TableField("closedDate")
    private LocalDateTime closedDate;

    @TableField("duplicateBug")
    private Integer duplicateBug;

    @TableField("linkBug")
    private String linkBug;

    //private Integer case;

    @TableField("caseVersion")
    private Integer caseVersion;

    private Integer result;

    private Integer testtask;

    @TableField("lastEditedBy")
    private String lastEditedBy;

    @TableField("lastEditedDate")
    private LocalDateTime lastEditedDate;

    private String deleted;


}
