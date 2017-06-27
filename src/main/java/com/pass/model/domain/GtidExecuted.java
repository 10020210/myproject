package com.pass.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gtid_executed"
    ,catalog="mysql"
)
public class GtidExecuted  implements java.io.Serializable {


     private GtidExecutedId id;
     private long intervalEnd;

    public GtidExecuted() {
    }

    public GtidExecuted(GtidExecutedId id, long intervalEnd) {
       this.id = id;
       this.intervalEnd = intervalEnd;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="sourceUuid", column=@Column(name="source_uuid", nullable=false, length=36) ), 
        @AttributeOverride(name="intervalStart", column=@Column(name="interval_start", nullable=false) ) } )
    public GtidExecutedId getId() {
        return this.id;
    }
    
    public void setId(GtidExecutedId id) {
        this.id = id;
    }

    
    @Column(name="interval_end", nullable=false)
    public long getIntervalEnd() {
        return this.intervalEnd;
    }
    
    public void setIntervalEnd(long intervalEnd) {
        this.intervalEnd = intervalEnd;
    }




}


