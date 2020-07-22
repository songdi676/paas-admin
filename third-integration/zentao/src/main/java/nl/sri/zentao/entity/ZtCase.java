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
public class ZtCase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer branch;

    private Integer lib;

    private Integer module;

    private Integer path;

    private Integer story;

    @TableField("storyVersion")
    private Integer storyVersion;

    private String title;

    private String precondition;

    private String keywords;

    private Integer pri;

    private String type;

    private String stage;

    @TableField("howRun")
    private String howRun;

    @TableField("scriptedBy")
    private String scriptedBy;

    @TableField("scriptedDate")
    private LocalDate scriptedDate;

    @TableField("scriptStatus")
    private String scriptStatus;

    @TableField("scriptLocation")
    private String scriptLocation;

    private String status;

    private String color;

    private String frequency;

    private Integer order;

    @TableField("openedBy")
    private String openedBy;

    @TableField("openedDate")
    private LocalDateTime openedDate;

    @TableField("reviewedBy")
    private String reviewedBy;

    @TableField("reviewedDate")
    private LocalDate reviewedDate;

    @TableField("lastEditedBy")
    private String lastEditedBy;

    @TableField("lastEditedDate")
    private LocalDateTime lastEditedDate;

    private Integer version;

    @TableField("linkCase")
    private String linkCase;

    @TableField("fromBug")
    private Integer fromBug;

    @TableField("fromCaseID")
    private Integer fromCaseID;

    private String deleted;

    @TableField("lastRunner")
    private String lastRunner;

    @TableField("lastRunDate")
    private LocalDateTime lastRunDate;

    @TableField("lastRunResult")
    private String lastRunResult;


}
