package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("INNODB_TRX")
public class InnodbTrx implements Serializable {

    private static final long serialVersionUID = 1L;

    private String trxId;

    private String trxState;

    private LocalDateTime trxStarted;

    private String trxRequestedLockId;

    private LocalDateTime trxWaitStarted;

    private Long trxWeight;

    private Long trxMysqlThreadId;

    private String trxQuery;

    private String trxOperationState;

    private Long trxTablesInUse;

    private Long trxTablesLocked;

    private Long trxLockStructs;

    private Long trxLockMemoryBytes;

    private Long trxRowsLocked;

    private Long trxRowsModified;

    private Long trxConcurrencyTickets;

    private String trxIsolationLevel;

    private Integer trxUniqueChecks;

    private Integer trxForeignKeyChecks;

    private String trxLastForeignKeyError;

    private Integer trxAdaptiveHashLatched;

    private Long trxAdaptiveHashTimeout;

    private Integer trxIsReadOnly;

    private Integer trxAutocommitNonLocking;


}
