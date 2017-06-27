package com.pass.model.domain;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="event"
    ,catalog="mysql"
)
public class Event  implements java.io.Serializable {


     private EventId id;
     private byte[] body;
     private String definer;
     private Date executeAt;
     private Integer intervalValue;
     private String intervalField;
     private Date created;
     private Date modified;
     private Date lastExecuted;
     private Date starts;
     private Date ends;
     private String status;
     private String onCompletion;
     private String sqlMode;
     private String comment;
     private int originator;
     private String timeZone;
     private String characterSetClient;
     private String collationConnection;
     private String dbCollation;
     private byte[] bodyUtf8;

    public Event() {
    }

	
    public Event(EventId id, byte[] body, String definer, Date created, Date modified, String status, String onCompletion, String sqlMode, String comment, int originator, String timeZone) {
        this.id = id;
        this.body = body;
        this.definer = definer;
        this.created = created;
        this.modified = modified;
        this.status = status;
        this.onCompletion = onCompletion;
        this.sqlMode = sqlMode;
        this.comment = comment;
        this.originator = originator;
        this.timeZone = timeZone;
    }
    public Event(EventId id, byte[] body, String definer, Date executeAt, Integer intervalValue, String intervalField, Date created, Date modified, Date lastExecuted, Date starts, Date ends, String status, String onCompletion, String sqlMode, String comment, int originator, String timeZone, String characterSetClient, String collationConnection, String dbCollation, byte[] bodyUtf8) {
       this.id = id;
       this.body = body;
       this.definer = definer;
       this.executeAt = executeAt;
       this.intervalValue = intervalValue;
       this.intervalField = intervalField;
       this.created = created;
       this.modified = modified;
       this.lastExecuted = lastExecuted;
       this.starts = starts;
       this.ends = ends;
       this.status = status;
       this.onCompletion = onCompletion;
       this.sqlMode = sqlMode;
       this.comment = comment;
       this.originator = originator;
       this.timeZone = timeZone;
       this.characterSetClient = characterSetClient;
       this.collationConnection = collationConnection;
       this.dbCollation = dbCollation;
       this.bodyUtf8 = bodyUtf8;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="db", column=@Column(name="db", nullable=false, length=64) ), 
        @AttributeOverride(name="name", column=@Column(name="name", nullable=false, length=64) ) } )
    public EventId getId() {
        return this.id;
    }
    
    public void setId(EventId id) {
        this.id = id;
    }

    
    @Column(name="body", nullable=false)
    public byte[] getBody() {
        return this.body;
    }
    
    public void setBody(byte[] body) {
        this.body = body;
    }

    
    @Column(name="definer", nullable=false, length=93)
    public String getDefiner() {
        return this.definer;
    }
    
    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="execute_at", length=19)
    public Date getExecuteAt() {
        return this.executeAt;
    }
    
    public void setExecuteAt(Date executeAt) {
        this.executeAt = executeAt;
    }

    
    @Column(name="interval_value")
    public Integer getIntervalValue() {
        return this.intervalValue;
    }
    
    public void setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
    }

    
    @Column(name="interval_field", length=18)
    public String getIntervalField() {
        return this.intervalField;
    }
    
    public void setIntervalField(String intervalField) {
        this.intervalField = intervalField;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=19)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="modified", nullable=false, length=19)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_executed", length=19)
    public Date getLastExecuted() {
        return this.lastExecuted;
    }
    
    public void setLastExecuted(Date lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="starts", length=19)
    public Date getStarts() {
        return this.starts;
    }
    
    public void setStarts(Date starts) {
        this.starts = starts;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ends", length=19)
    public Date getEnds() {
        return this.ends;
    }
    
    public void setEnds(Date ends) {
        this.ends = ends;
    }

    
    @Column(name="status", nullable=false, length=18)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="on_completion", nullable=false, length=8)
    public String getOnCompletion() {
        return this.onCompletion;
    }
    
    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    
    @Column(name="sql_mode", nullable=false, length=478)
    public String getSqlMode() {
        return this.sqlMode;
    }
    
    public void setSqlMode(String sqlMode) {
        this.sqlMode = sqlMode;
    }

    
    @Column(name="comment", nullable=false, length=64)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    
    @Column(name="originator", nullable=false)
    public int getOriginator() {
        return this.originator;
    }
    
    public void setOriginator(int originator) {
        this.originator = originator;
    }

    
    @Column(name="time_zone", nullable=false, length=64)
    public String getTimeZone() {
        return this.timeZone;
    }
    
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    
    @Column(name="character_set_client", length=32)
    public String getCharacterSetClient() {
        return this.characterSetClient;
    }
    
    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    
    @Column(name="collation_connection", length=32)
    public String getCollationConnection() {
        return this.collationConnection;
    }
    
    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    
    @Column(name="db_collation", length=32)
    public String getDbCollation() {
        return this.dbCollation;
    }
    
    public void setDbCollation(String dbCollation) {
        this.dbCollation = dbCollation;
    }

    
    @Column(name="body_utf8")
    public byte[] getBodyUtf8() {
        return this.bodyUtf8;
    }
    
    public void setBodyUtf8(byte[] bodyUtf8) {
        this.bodyUtf8 = bodyUtf8;
    }




}


