package nl.sri.devCloud.entity;

import java.time.LocalDate;
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
public class VProject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("PROJECT_ID")
    private String projectId;

    /**
     * 项目编号
     */
    @TableField("PROJECT_CODE")
    private String projectCode;

    /**
     * 项目名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 英文简称
     */
    @TableField("ABBR_NAME")
    private String abbrName;

    /**
     * 项目类型
     */
    @TableField("TYPE")
    private Integer type;

    /**
     * 项目经理
     */
    @TableField("PM")
    private String pm;

    /**
     * 项目状态
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 项目周期开始
     */
    @TableField("DATE_START")
    private LocalDate dateStart;

    /**
     * 项目周期结束
     */
    @TableField("DATE_END")
    private LocalDate dateEnd;

    /**
     * 虚拟部门
     */
    @TableField("VIRTUAL_DEPARTMENT_ID")
    private String virtualDepartmentId;

    /**
     * 项目描述
     */
    @TableField("DESCRIPTION")
    private String description;


}
