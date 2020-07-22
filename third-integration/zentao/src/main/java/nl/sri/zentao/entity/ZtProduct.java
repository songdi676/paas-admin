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
public class ZtProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String code;

    private Integer line;

    private String type;

    private String status;

    private String desc;

    @TableField("PO")
    private String po;

    @TableField("QD")
    private String qd;

    @TableField("RD")
    private String rd;

    private String acl;

    private String whitelist;

    @TableField("createdBy")
    private String createdBy;

    @TableField("createdDate")
    private LocalDateTime createdDate;

    @TableField("createdVersion")
    private String createdVersion;

    private Integer order;

    private String deleted;


}
