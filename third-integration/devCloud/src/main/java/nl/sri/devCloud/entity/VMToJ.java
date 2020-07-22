package nl.sri.devCloud.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author wurunxiang
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class VMToJ implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer jenkinsId;

    private Integer moduleId;

    private Integer createUser;

    private Integer createDate;

    private Integer updateUser;

    private Integer updateDate;

    private Integer objStatus;

    private Integer isBackup;

    private Integer moduleName;

    private Integer jenkinsName;


}
