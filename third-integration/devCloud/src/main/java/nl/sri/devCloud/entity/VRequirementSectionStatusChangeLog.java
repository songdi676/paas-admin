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
public class VRequirementSectionStatusChangeLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 阶段需求单编号
     */
    private String 阶段需求编号;

    private String 操作者;

    /**
     * 操作时间
     */
    private LocalDateTime 操作时间;

    private String 旧状态;

    private String 新状态;

    /**
     * 操作人
     */
    private String userId;

    /**
     * 阶段需求ID
     */
    @TableField("REQUIREMENT_SECTION_ID")
    private String requirementSectionId;


}
