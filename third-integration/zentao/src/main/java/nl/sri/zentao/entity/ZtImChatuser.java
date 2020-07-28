package nl.sri.zentao.entity;

import java.time.LocalDateTime;
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
public class ZtImChatuser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String cgid;

    private Integer user;

    private Integer order;

    private String star;

    private String hide;

    private String mute;

    private LocalDateTime join;

    private LocalDateTime quit;

    private String category;


}
