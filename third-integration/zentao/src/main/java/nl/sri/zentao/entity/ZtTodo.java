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
public class ZtTodo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account;

    private LocalDate date;

    private Integer begin;

    private Integer end;

    private String type;

    private Integer cycle;

    private Integer idvalue;

    private Integer pri;

    private String name;

    private String desc;

    private String status;

    //private Boolean private;

    private String config;

    @TableField("assignedTo")
    private String assignedTo;

    @TableField("assignedBy")
    private String assignedBy;

    @TableField("assignedDate")
    private LocalDateTime assignedDate;

    @TableField("finishedBy")
    private String finishedBy;

    @TableField("finishedDate")
    private LocalDateTime finishedDate;

    @TableField("closedBy")
    private String closedBy;

    @TableField("closedDate")
    private LocalDateTime closedDate;


}
