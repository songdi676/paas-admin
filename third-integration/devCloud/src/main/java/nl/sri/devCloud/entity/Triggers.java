package nl.sri.devCloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("TRIGGERS")
public class Triggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("TRIGGER_CATALOG")
    private String triggerCatalog;

    @TableField("TRIGGER_SCHEMA")
    private String triggerSchema;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("EVENT_MANIPULATION")
    private String eventManipulation;

    @TableField("EVENT_OBJECT_CATALOG")
    private String eventObjectCatalog;

    @TableField("EVENT_OBJECT_SCHEMA")
    private String eventObjectSchema;

    @TableField("EVENT_OBJECT_TABLE")
    private String eventObjectTable;

    @TableField("ACTION_ORDER")
    private Long actionOrder;

    @TableField("ACTION_CONDITION")
    private String actionCondition;

    @TableField("ACTION_STATEMENT")
    private String actionStatement;

    @TableField("ACTION_ORIENTATION")
    private String actionOrientation;

    @TableField("ACTION_TIMING")
    private String actionTiming;

    @TableField("ACTION_REFERENCE_OLD_TABLE")
    private String actionReferenceOldTable;

    @TableField("ACTION_REFERENCE_NEW_TABLE")
    private String actionReferenceNewTable;

    @TableField("ACTION_REFERENCE_OLD_ROW")
    private String actionReferenceOldRow;

    @TableField("ACTION_REFERENCE_NEW_ROW")
    private String actionReferenceNewRow;

    @TableField("CREATED")
    private LocalDateTime created;

    @TableField("SQL_MODE")
    private String sqlMode;

    @TableField("DEFINER")
    private String definer;

    @TableField("CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @TableField("COLLATION_CONNECTION")
    private String collationConnection;

    @TableField("DATABASE_COLLATION")
    private String databaseCollation;


}
