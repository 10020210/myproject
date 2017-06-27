package com.pass.model.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="time_zone_transition"
    ,catalog="mysql"
)
public class TimeZoneTransition  implements java.io.Serializable {


     private TimeZoneTransitionId id;
     private int transitionTypeId;

    public TimeZoneTransition() {
    }

    public TimeZoneTransition(TimeZoneTransitionId id, int transitionTypeId) {
       this.id = id;
       this.transitionTypeId = transitionTypeId;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="timeZoneId", column=@Column(name="Time_zone_id", nullable=false) ), 
        @AttributeOverride(name="transitionTime", column=@Column(name="Transition_time", nullable=false) ) } )
    public TimeZoneTransitionId getId() {
        return this.id;
    }
    
    public void setId(TimeZoneTransitionId id) {
        this.id = id;
    }

    
    @Column(name="Transition_type_id", nullable=false)
    public int getTransitionTypeId() {
        return this.transitionTypeId;
    }
    
    public void setTransitionTypeId(int transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }




}


