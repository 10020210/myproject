package com.pass.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ndb_binlog_index"
    ,catalog="mysql"
)
public class NdbBinlogIndex  implements java.io.Serializable {


     private NdbBinlogIndexId id;
     private long position;
     private String file;
     private int inserts;
     private int updates;
     private int deletes;
     private int schemaops;
     private int gci;
     private long nextPosition;
     private String nextFile;

    public NdbBinlogIndex() {
    }

    public NdbBinlogIndex(NdbBinlogIndexId id, long position, String file, int inserts, int updates, int deletes, int schemaops, int gci, long nextPosition, String nextFile) {
       this.id = id;
       this.position = position;
       this.file = file;
       this.inserts = inserts;
       this.updates = updates;
       this.deletes = deletes;
       this.schemaops = schemaops;
       this.gci = gci;
       this.nextPosition = nextPosition;
       this.nextFile = nextFile;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="epoch", column=@Column(name="epoch", nullable=false) ), 
        @AttributeOverride(name="origServerId", column=@Column(name="orig_server_id", nullable=false) ), 
        @AttributeOverride(name="origEpoch", column=@Column(name="orig_epoch", nullable=false) ) } )
    public NdbBinlogIndexId getId() {
        return this.id;
    }
    
    public void setId(NdbBinlogIndexId id) {
        this.id = id;
    }

    
    @Column(name="Position", nullable=false)
    public long getPosition() {
        return this.position;
    }
    
    public void setPosition(long position) {
        this.position = position;
    }

    
    @Column(name="File", nullable=false)
    public String getFile() {
        return this.file;
    }
    
    public void setFile(String file) {
        this.file = file;
    }

    
    @Column(name="inserts", nullable=false)
    public int getInserts() {
        return this.inserts;
    }
    
    public void setInserts(int inserts) {
        this.inserts = inserts;
    }

    
    @Column(name="updates", nullable=false)
    public int getUpdates() {
        return this.updates;
    }
    
    public void setUpdates(int updates) {
        this.updates = updates;
    }

    
    @Column(name="deletes", nullable=false)
    public int getDeletes() {
        return this.deletes;
    }
    
    public void setDeletes(int deletes) {
        this.deletes = deletes;
    }

    
    @Column(name="schemaops", nullable=false)
    public int getSchemaops() {
        return this.schemaops;
    }
    
    public void setSchemaops(int schemaops) {
        this.schemaops = schemaops;
    }

    
    @Column(name="gci", nullable=false)
    public int getGci() {
        return this.gci;
    }
    
    public void setGci(int gci) {
        this.gci = gci;
    }

    
    @Column(name="next_position", nullable=false)
    public long getNextPosition() {
        return this.nextPosition;
    }
    
    public void setNextPosition(long nextPosition) {
        this.nextPosition = nextPosition;
    }

    
    @Column(name="next_file", nullable=false)
    public String getNextFile() {
        return this.nextFile;
    }
    
    public void setNextFile(String nextFile) {
        this.nextFile = nextFile;
    }




}


