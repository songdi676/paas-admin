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
public class ZtTestrun implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer task;

    //private Integer case;

    private Integer version;

    @TableField("assignedTo")
    private String assignedTo;

    @TableField("lastRunner")
    private String lastRunner;

    @TableField("lastRunDate")
    private LocalDateTime lastRunDate;

    @TableField("lastRunResult")
    private String lastRunResult;

    private String status;


}
