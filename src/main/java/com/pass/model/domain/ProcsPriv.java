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
import javax.persistence.Version;

@Entity
@Table(name="procs_priv"
    ,catalog="mysql"
)
public class ProcsPriv  implements java.io.Serializable {


     private ProcsPrivId id;
     private Date timestamp;
     private String grantor;
     private String procPriv;

    public ProcsPriv() {
    }

    public ProcsPriv(ProcsPrivId id, String grantor, String procPriv) {
       this.id = id;
       this.grantor = grantor;
       this.procPriv = procPriv;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="Host", nullable=false, length=60) ), 
        @AttributeOverride(name="db", column=@Column(name="Db", nullable=false, length=64) ), 
        @AttributeOverride(name="user", column=@Column(name="User", nullable=false, length=32) ), 
        @AttributeOverride(name="routineName", column=@Column(name="Routine_name", nullable=false, length=64) ), 
        @AttributeOverride(name="routineType", column=@Column(name="Routine_type", nullable=false, length=9) ) } )
    public ProcsPrivId getId() {
        return this.id;
    }
    
    public void setId(ProcsPrivId id) {
        this.id = id;
    }

    @Version@Temporal(TemporalType.TIMESTAMP)
    @Column(name="Timestamp", nullable=false, length=19)
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
    @Column(name="Grantor", nullable=false, length=93)
    public String getGrantor() {
        return this.grantor;
    }
    
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    
    @Column(name="Proc_priv", nullable=false, length=27)
    public String getProcPriv() {
        return this.procPriv;
    }
    
    public void setProcPriv(String procPriv) {
        this.procPriv = procPriv;
    }




}


