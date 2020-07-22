package nl.sri.devCloud.entity;

import java.time.LocalDate;
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
public class ZtRelease implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer branch;

    private Integer build;

    private String name;

    private String marker;

    private LocalDate date;

    private String stories;

    private String bugs;

    @TableField("leftBugs")
    private String leftBugs;

    private String desc;

    private String status;

    private String deleted;


}
