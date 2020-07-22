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
public class ZtScore implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account;

    private String module;

    private String method;

    private String desc;

    private Integer before;

    private Integer score;

    private Integer after;

    private LocalDateTime time;


}
