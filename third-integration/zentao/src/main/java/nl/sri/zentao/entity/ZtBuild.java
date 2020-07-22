package nl.sri.zentao.entity;

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
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtBuild implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer branch;

    private Integer project;

    private String name;

    @TableField("scmPath")
    private String scmPath;

    @TableField("filePath")
    private String filePath;

    private LocalDate date;

    private String stories;

    private String bugs;

    private String builder;

    private String desc;

    private String deleted;


}
