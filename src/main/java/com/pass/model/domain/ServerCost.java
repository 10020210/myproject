package com.pass.model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="server_cost"
    ,catalog="mysql"
)
public class ServerCost  implements java.io.Serializable {


     private String costName;
     private Float costValue;
     private Date lastUpdate;
     private String comment;

    public ServerCost() {
    }

	
    public ServerCost(String costName, Date lastUpdate) {
        this.costName = costName;
        this.lastUpdate = lastUpdate;
    }
    public ServerCost(String costName, Float costValue, Date lastUpdate, String comment) {
       this.costName = costName;
       this.costValue = costValue;
       this.lastUpdate = lastUpdate;
       this.comment = comment;
    }
   
     @Id 

    
    @Column(name="cost_name", unique=true, nullable=false, length=64)
    public String getCostName() {
        return this.costName;
    }
    
    public void setCostName(String costName) {
        this.costName = costName;
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


