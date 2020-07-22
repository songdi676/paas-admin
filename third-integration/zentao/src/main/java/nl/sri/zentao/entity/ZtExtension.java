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
public class ZtExtension implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String code;

    private String version;

    private String author;

    private String desc;

    private String license;

    private String type;

    private String site;

    @TableField("zentaoCompatible")
    private String zentaoCompatible;

    @TableField("installedTime")
    private LocalDateTime installedTime;

    private String depends;

    private String dirs;

    private String files;

    private String status;


}
