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
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("EVENTS")
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("EVENT_CATALOG")
    private String eventCatalog;

    @TableField("EVENT_SCHEMA")
    private String eventSchema;

    @TableField("EVENT_NAME")
    private String eventName;

    @TableField("DEFINER")
    private String definer;

    @TableField("TIME_ZONE")
    private String timeZone;

    @TableField("EVENT_BODY")
    private String eventBody;

    @TableField("EVENT_DEFINITION")
    private String eventDefinition;

    @TableField("EVENT_TYPE")
    private String eventType;

    @TableField("EXECUTE_AT")
    private LocalDateTime executeAt;

    @TableField("INTERVAL_VALUE")
    private String intervalValue;

    @TableField("INTERVAL_FIELD")
    private String intervalField;

    @TableField("SQL_MODE")
    private String sqlMode;

    @TableField("STARTS")
    private LocalDateTime starts;

    @TableField("ENDS")
    private LocalDateTime ends;

    @TableField("STATUS")
    private String status;

    @TableField("ON_COMPLETION")
    private String onCompletion;

    @TableField("CREATED")
    private LocalDateTime created;

    @TableField("LAST_ALTERED")
    private LocalDateTime lastAltered;

    @TableField("LAST_EXECUTED")
    private LocalDateTime lastExecuted;

    @TableField("EVENT_COMMENT")
    private String eventComment;

    @TableField("ORIGINATOR")
    private Long originator;

    @TableField("CHARACTER_SET_CLIENT")
    private String characterSetClient;

    @TableField("COLLATION_CONNECTION")
    private String collationConnection;

    @TableField("DATABASE_COLLATION")
    private String databaseCollation;


}
