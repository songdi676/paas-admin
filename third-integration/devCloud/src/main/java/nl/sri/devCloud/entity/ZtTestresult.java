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
public class ZtTestresult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer run;

    //private Integer case;

    private Integer version;

    @TableField("caseResult")
    private String caseResult;

    @TableField("stepResults")
    private String stepResults;

    @TableField("lastRunner")
    private String lastRunner;

    private LocalDateTime date;


}
