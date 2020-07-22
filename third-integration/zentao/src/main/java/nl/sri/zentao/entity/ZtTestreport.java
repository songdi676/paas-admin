package nl.sri.zentao.entity;

import java.time.LocalDate;
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
 * @since 2020-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtTestreport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer product;

    private Integer project;

    private String tasks;

    private String builds;

    private String title;

    private LocalDate begin;

    private LocalDate end;

    private String owner;

    private String members;

    private String stories;

    private String bugs;

    private String cases;

    private String report;

    @TableField("objectType")
    private String objectType;

    @TableField("objectID")
    private Integer objectID;

    @TableField("createdBy")
    private String createdBy;

    @TableField("createdDate")
    private LocalDateTime createdDate;

    private String deleted;


}
