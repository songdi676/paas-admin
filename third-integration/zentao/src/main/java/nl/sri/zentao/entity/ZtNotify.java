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
public class ZtNotify implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("objectType")
    private String objectType;

    @TableField("objectID")
    private Integer objectID;

    private Integer action;

    @TableField("toList")
    private String toList;

    @TableField("ccList")
    private String ccList;

    private String subject;

    private String data;

    @TableField("createdBy")
    private String createdBy;

    @TableField("createdDate")
    private LocalDateTime createdDate;

    @TableField("sendTime")
    private LocalDateTime sendTime;

    private String status;

    @TableField("failReason")
    private String failReason;


}
