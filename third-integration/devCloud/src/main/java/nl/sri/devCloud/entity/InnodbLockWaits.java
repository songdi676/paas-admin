package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("INNODB_LOCK_WAITS")
public class InnodbLockWaits implements Serializable {

    private static final long serialVersionUID = 1L;

    private String requestingTrxId;

    private String requestedLockId;

    private String blockingTrxId;

    private String blockingLockId;


}
