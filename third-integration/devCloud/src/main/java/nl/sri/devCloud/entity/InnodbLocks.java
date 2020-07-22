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
@TableName("INNODB_LOCKS")
public class InnodbLocks implements Serializable {

    private static final long serialVersionUID = 1L;

    private String lockId;

    private String lockTrxId;

    private String lockMode;

    private String lockType;

    private String lockTable;

    private String lockIndex;

    private Long lockSpace;

    private Long lockPage;

    private Long lockRec;

    private String lockData;


}
