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
@TableName("INNODB_CMP_PER_INDEX_RESET")
public class InnodbCmpPerIndexReset implements Serializable {

    private static final long serialVersionUID = 1L;

    private String databaseName;

    private String tableName;

    private String indexName;

    private Integer compressOps;

    private Integer compressOpsOk;

    private Integer compressTime;

    private Integer uncompressOps;

    private Integer uncompressTime;


}
