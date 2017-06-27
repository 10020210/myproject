package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="time_zone_leap_second"
    ,catalog="mysql"
)
public class TimeZoneLeapSecond  implements java.io.Serializable {


     private long transitionTime;
     private int correction;

    public TimeZoneLeapSecond() {
    }

    public TimeZoneLeapSecond(long transitionTime, int correction) {
       this.transitionTime = transitionTime;
       this.correction = correction;
    }
   
     @Id 

    
    @Column(name="Transition_time", unique=true, nullable=false)
    public long getTransitionTime() {
        return this.transitionTime;
    }
    
    public void setTransitionTime(long transitionTime) {
        this.transitionTime = transitionTime;
    }

    
    @Column(name="Correction", nullable=false)
    public int getCorrection() {
        return this.correction;
    }
    
    public void setCorrection(int correction) {
        this.correction = correction;
    }




}


