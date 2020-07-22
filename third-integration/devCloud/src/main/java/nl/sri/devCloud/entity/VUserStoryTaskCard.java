package nl.sri.devCloud.entity;

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
public class VUserStoryTaskCard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户故事计划项，只有故事卡片能填写该字段，其余为NULL
     */
    private String userStoryId;

    private String appId;

    private Long taskCardCount;

    private String taskUserIds;


}
