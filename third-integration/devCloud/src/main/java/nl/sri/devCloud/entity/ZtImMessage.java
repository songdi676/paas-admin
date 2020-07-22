package nl.sri.devCloud.entity;

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
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZtImMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String gid;

    private String cgid;

    private String user;

    private LocalDateTime date;

    private Long order;

    private String type;

    private String content;

    @TableField("contentType")
    private String contentType;

    private String data;


}
