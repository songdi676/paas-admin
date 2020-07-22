package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PLUGINS")
public class Plugins implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("PLUGIN_NAME")
    private String pluginName;

    @TableField("PLUGIN_VERSION")
    private String pluginVersion;

    @TableField("PLUGIN_STATUS")
    private String pluginStatus;

    @TableField("PLUGIN_TYPE")
    private String pluginType;

    @TableField("PLUGIN_TYPE_VERSION")
    private String pluginTypeVersion;

    @TableField("PLUGIN_LIBRARY")
    private String pluginLibrary;

    @TableField("PLUGIN_LIBRARY_VERSION")
    private String pluginLibraryVersion;

    @TableField("PLUGIN_AUTHOR")
    private String pluginAuthor;

    @TableField("PLUGIN_DESCRIPTION")
    private String pluginDescription;

    @TableField("PLUGIN_LICENSE")
    private String pluginLicense;

    @TableField("LOAD_OPTION")
    private String loadOption;


}
