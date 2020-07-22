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
public class ZtCron implements Serializable {

    private static final long serialVersionUID = 1L;

    private String m;

    private String h;

    private String dom;

    private String mon;

    private String dow;

    private String command;

    private String remark;

    private String type;

    private Boolean buildin;

    private String status;

    @TableField("lastTime")
    private LocalDateTime lastTime;


}
