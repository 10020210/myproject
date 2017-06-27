package com.pass.model.domain;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="slave_worker_info"
    ,catalog="mysql"
)
public class SlaveWorkerInfo  implements java.io.Serializable {


     private SlaveWorkerInfoId id;
     private String relayLogName;
     private long relayLogPos;
     private String masterLogName;
     private long masterLogPos;
     private String checkpointRelayLogName;
     private long checkpointRelayLogPos;
     private String checkpointMasterLogName;
     private long checkpointMasterLogPos;
     private int checkpointSeqno;
     private int checkpointGroupSize;
     private byte[] checkpointGroupBitmap;

    public SlaveWorkerInfo() {
    }

    public SlaveWorkerInfo(SlaveWorkerInfoId id, String relayLogName, long relayLogPos, String masterLogName, long masterLogPos, String checkpointRelayLogName, long checkpointRelayLogPos, String checkpointMasterLogName, long checkpointMasterLogPos, int checkpointSeqno, int checkpointGroupSize, byte[] checkpointGroupBitmap) {
       this.id = id;
       this.relayLogName = relayLogName;
       this.relayLogPos = relayLogPos;
       this.masterLogName = masterLogName;
       this.masterLogPos = masterLogPos;
       this.checkpointRelayLogName = checkpointRelayLogName;
       this.checkpointRelayLogPos = checkpointRelayLogPos;
       this.checkpointMasterLogName = checkpointMasterLogName;
       this.checkpointMasterLogPos = checkpointMasterLogPos;
       this.checkpointSeqno = checkpointSeqno;
       this.checkpointGroupSize = checkpointGroupSize;
       this.checkpointGroupBitmap = checkpointGroupBitmap;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="channelName", column=@Column(name="Channel_name", nullable=false, length=64) ), 
        @AttributeOverride(name="id", column=@Column(name="Id", nullable=false) ) } )
    public SlaveWorkerInfoId getId() {
        return this.id;
    }
    
    public void setId(SlaveWorkerInfoId id) {
        this.id = id;
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

    
    @Column(name="Checkpoint_relay_log_name", nullable=false, length=65535)
    public String getCheckpointRelayLogName() {
        return this.checkpointRelayLogName;
    }
    
    public void setCheckpointRelayLogName(String checkpointRelayLogName) {
        this.checkpointRelayLogName = checkpointRelayLogName;
    }

    
    @Column(name="Checkpoint_relay_log_pos", nullable=false)
    public long getCheckpointRelayLogPos() {
        return this.checkpointRelayLogPos;
    }
    
    public void setCheckpointRelayLogPos(long checkpointRelayLogPos) {
        this.checkpointRelayLogPos = checkpointRelayLogPos;
    }

    
    @Column(name="Checkpoint_master_log_name", nullable=false, length=65535)
    public String getCheckpointMasterLogName() {
        return this.checkpointMasterLogName;
    }
    
    public void setCheckpointMasterLogName(String checkpointMasterLogName) {
        this.checkpointMasterLogName = checkpointMasterLogName;
    }

    
    @Column(name="Checkpoint_master_log_pos", nullable=false)
    public long getCheckpointMasterLogPos() {
        return this.checkpointMasterLogPos;
    }
    
    public void setCheckpointMasterLogPos(long checkpointMasterLogPos) {
        this.checkpointMasterLogPos = checkpointMasterLogPos;
    }

    
    @Column(name="Checkpoint_seqno", nullable=false)
    public int getCheckpointSeqno() {
        return this.checkpointSeqno;
    }
    
    public void setCheckpointSeqno(int checkpointSeqno) {
        this.checkpointSeqno = checkpointSeqno;
    }

    
    @Column(name="Checkpoint_group_size", nullable=false)
    public int getCheckpointGroupSize() {
        return this.checkpointGroupSize;
    }
    
    public void setCheckpointGroupSize(int checkpointGroupSize) {
        this.checkpointGroupSize = checkpointGroupSize;
    }

    
    @Column(name="Checkpoint_group_bitmap", nullable=false)
    public byte[] getCheckpointGroupBitmap() {
        return this.checkpointGroupBitmap;
    }
    
    public void setCheckpointGroupBitmap(byte[] checkpointGroupBitmap) {
        this.checkpointGroupBitmap = checkpointGroupBitmap;
    }




}


