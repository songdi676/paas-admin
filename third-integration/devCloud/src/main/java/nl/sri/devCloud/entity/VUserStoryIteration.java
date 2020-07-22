package nl.sri.devCloud.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class VUserStoryIteration implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 上一个轨迹点ID,第个轨迹点默认-1
     */
    @TableField("LAST_ID")
    private String lastId;

    @TableField("USER_STORY_ID")
    private String userStoryId;

    @TableField("AGILE_PLAN_ID")
    private String agilePlanId;

    /**
     * 操作者
     */
    @TableField("OPERATOR")
    private String operator;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;


}
