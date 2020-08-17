package nl.sri.zentao.entity;

import java.time.LocalDate;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;

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
public class ZtBurn implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer project;

    private LocalDate date;

    private Float estimate;
    @TableField("`left`")
    private Float left;

    private Float consumed;

}
