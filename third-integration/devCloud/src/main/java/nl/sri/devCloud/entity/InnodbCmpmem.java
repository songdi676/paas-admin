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
@TableName("INNODB_CMPMEM")
public class InnodbCmpmem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer pageSize;

    private Integer bufferPoolInstance;

    private Integer pagesUsed;

    private Integer pagesFree;

    private Long relocationOps;

    private Integer relocationTime;


}
