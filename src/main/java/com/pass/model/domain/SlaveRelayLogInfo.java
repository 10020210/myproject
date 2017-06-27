package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slave_relay_log_info"
    ,catalog="mysql"
)
public class SlaveRelayLogInfo  implements java.io.Serializable {


     private String channelName;
     private int numberOfLines;
     private String relayLogName;
     private long relayLogPos;
     private String masterLogName;
     private long masterLogPos;
     private int sqlDelay;
     private int numberOfWorkers;
     private int id;

    public SlaveRelayLogInfo() {
    }

    public SlaveRelayLogInfo(String channelName, int numberOfLines, String relayLogName, long relayLogPos, String masterLogName, long masterLogPos, int sqlDelay, int numberOfWorkers, int id) {
       this.channelName = channelName;
       this.numberOfLines = numberOfLines;
       this.relayLogName = relayLogName;
       this.relayLogPos = relayLogPos;
       this.masterLogName = masterLogName;
       this.masterLogPos = masterLogPos;
       this.sqlDelay = sqlDelay;
       this.numberOfWorkers = numberOfWorkers;
       this.id = id;
    }
   
     @Id 

    
    @Column(name="Channel_name", unique=true, nullable=false, length=64)
    public String getChannelName() {
        return this.channelName;
    }
    
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    
    @Column(name="Number_of_lines", nullable=false)
    public int getNumberOfLines() {
        return this.numberOfLines;
    }
    
    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    
    @Column(name="Relay_log_name", nullable=false, length=65535)
    public String getRelayLogName() {
        return this.relayLogName;
    }
    
    public void setRelayLogName(String relayLogName) {
        this.relayLogName = relayLogName;
    }

    
    @Column(name="Relay_log_pos", nullable=false)
    public long getRelayLogPos() {
        return this.relayLogPos;
    }
    
    public void setRelayLogPos(long relayLogPos) {
        this.relayLogPos = relayLogPos;
    }

    
    @Column(name="Master_log_name", nullable=false, length=65535)
    public String getMasterLogName() {
        return this.masterLogName;
    }
    
    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    
    @Column(name="Master_log_pos", nullable=false)
    public long getMasterLogPos() {
        return this.masterLogPos;
    }
    
    public void setMasterLogPos(long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    
    @Column(name="Sql_delay", nullable=false)
    public int getSqlDelay() {
        return this.sqlDelay;
    }
    
    public void setSqlDelay(int sqlDelay) {
        this.sqlDelay = sqlDelay;
    }

    
    @Column(name="Number_of_workers", nullable=false)
    public int getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    
    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    
    @Column(name="Id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }




}


