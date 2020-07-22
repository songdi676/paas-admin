package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("INNODB_METRICS")
public class InnodbMetrics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("NAME")
    private String name;

    @TableField("SUBSYSTEM")
    private String subsystem;

    @TableField("COUNT")
    private Long count;

    @TableField("MAX_COUNT")
    private Long maxCount;

    @TableField("MIN_COUNT")
    private Long minCount;

    @TableField("AVG_COUNT")
    private Double avgCount;

    @TableField("COUNT_RESET")
    private Long countReset;

    @TableField("MAX_COUNT_RESET")
    private Long maxCountReset;

    @TableField("MIN_COUNT_RESET")
    private Long minCountReset;

    @TableField("AVG_COUNT_RESET")
    private Double avgCountReset;

    @TableField("TIME_ENABLED")
    private LocalDateTime timeEnabled;

    @TableField("TIME_DISABLED")
    private LocalDateTime timeDisabled;

    @TableField("TIME_ELAPSED")
    private Long timeElapsed;

    @TableField("TIME_RESET")
    private LocalDateTime timeReset;

    @TableField("STATUS")
    private String status;

    @TableField("TYPE")
    private String type;

    @TableField("COMMENT")
    private String comment;


}
