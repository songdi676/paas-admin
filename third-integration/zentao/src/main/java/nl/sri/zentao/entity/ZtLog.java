package nl.sri.zentao.entity;

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
public class ZtLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @TableField("objectType")
    private String objectType;

    @TableField("objectID")
    private Integer objectID;

    private Integer action;

    private LocalDateTime date;

    private String url;

    @TableField("contentType")
    private String contentType;

    private String data;

    private String result;


}
