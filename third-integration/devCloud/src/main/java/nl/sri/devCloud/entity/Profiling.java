package nl.sri.devCloud.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PROFILING")
public class Profiling implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("QUERY_ID")
    private Integer queryId;

    @TableField("SEQ")
    private Integer seq;

    @TableField("STATE")
    private String state;

    @TableField("DURATION")
    private BigDecimal duration;

    @TableField("CPU_USER")
    private BigDecimal cpuUser;

    @TableField("CPU_SYSTEM")
    private BigDecimal cpuSystem;

    @TableField("CONTEXT_VOLUNTARY")
    private Integer contextVoluntary;

    @TableField("CONTEXT_INVOLUNTARY")
    private Integer contextInvoluntary;

    @TableField("BLOCK_OPS_IN")
    private Integer blockOpsIn;

    @TableField("BLOCK_OPS_OUT")
    private Integer blockOpsOut;

    @TableField("MESSAGES_SENT")
    private Integer messagesSent;

    @TableField("MESSAGES_RECEIVED")
    private Integer messagesReceived;

    @TableField("PAGE_FAULTS_MAJOR")
    private Integer pageFaultsMajor;

    @TableField("PAGE_FAULTS_MINOR")
    private Integer pageFaultsMinor;

    @TableField("SWAPS")
    private Integer swaps;

    @TableField("SOURCE_FUNCTION")
    private String sourceFunction;

    @TableField("SOURCE_FILE")
    private String sourceFile;

    @TableField("SOURCE_LINE")
    private Integer sourceLine;


}
