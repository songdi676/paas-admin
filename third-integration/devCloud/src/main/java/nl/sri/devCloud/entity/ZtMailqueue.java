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
public class ZtMailqueue implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("toList")
    private String toList;

    @TableField("ccList")
    private String ccList;

    private String subject;

    private String body;

    @TableField("addedBy")
    private String addedBy;

    @TableField("addedDate")
    private LocalDateTime addedDate;

    @TableField("sendTime")
    private LocalDateTime sendTime;

    private String status;

    @TableField("failReason")
    private String failReason;


}
