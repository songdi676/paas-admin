package nl.sri.devCloud.entity;

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
public class ZtProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("isCat")
    private String isCat;

    @TableField("catID")
    private Integer catID;

    private String type;

    private Integer parent;

    private String name;

    private String code;

    private LocalDate begin;

    private LocalDate end;

    private Integer days;

    private String status;

    private String statge;

    private String pri;

    @TableField("`desc`")
    private String desc;

    @TableField("openedBy")
    private String openedBy;

    @TableField("openedDate")
    private LocalDateTime openedDate;

    @TableField("openedVersion")
    private String openedVersion;

    @TableField("closedBy")
    private String closedBy;

    @TableField("closedDate")
    private LocalDateTime closedDate;

    @TableField("canceledBy")
    private String canceledBy;

    @TableField("canceledDate")
    private LocalDateTime canceledDate;

    @TableField("PO")
    private String po;

    @TableField("PM")
    private String pm;

    @TableField("QD")
    private String qd;

    @TableField("RD")
    private String rd;

    private String team;

    private String acl;

    private String whitelist;

    @TableField("`order`")
    private Integer order;

    private String deleted;


}
