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
@Table(name="engine_cost"
    ,catalog="mysql"
)
public class EngineCost  implements java.io.Serializable {


     private EngineCostId id;
     private Float costValue;
     private Date lastUpdate;
     private String comment;

    public EngineCost() {
    }

	
    public EngineCost(EngineCostId id, Date lastUpdate) {
        this.id = id;
        this.lastUpdate = lastUpdate;
    }
    public EngineCost(EngineCostId id, Float costValue, Date lastUpdate, String comment) {
       this.id = id;
       this.costValue = costValue;
       this.lastUpdate = lastUpdate;
       this.comment = comment;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="costName", column=@Column(name="cost_name", nullable=false, length=64) ), 
        @AttributeOverride(name="engineName", column=@Column(name="engine_name", nullable=false, length=64) ), 
        @AttributeOverride(name="deviceType", column=@Column(name="device_type", nullable=false) ) } )
    public EngineCostId getId() {
        return this.id;
    }
    
    public void setId(EngineCostId id) {
        this.id = id;
    }

    
    @Column(name="cost_value", precision=12, scale=0)
    public Float getCostValue() {
        return this.costValue;
    }
    
    public void setCostValue(Float costValue) {
        this.costValue = costValue;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
    @Column(name="comment", length=1024)
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }




}


