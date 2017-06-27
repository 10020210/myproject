package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TimeZoneTransitionId  implements java.io.Serializable {


     private int timeZoneId;
     private long transitionTime;

    public TimeZoneTransitionId() {
    }

    public TimeZoneTransitionId(int timeZoneId, long transitionTime) {
       this.timeZoneId = timeZoneId;
       this.transitionTime = transitionTime;
    }
   


    @Column(name="Time_zone_id", nullable=false)
    public int getTimeZoneId() {
        return this.timeZoneId;
    }
    
    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    @Column(name="Transition_time", nullable=false)
    public long getTransitionTime() {
        return this.transitionTime;
    }
    
    public void setTransitionTime(long transitionTime) {
        this.transitionTime = transitionTime;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TimeZoneTransitionId) ) return false;
		 TimeZoneTransitionId castOther = ( TimeZoneTransitionId ) other; 
         
		 return (this.getTimeZoneId()==castOther.getTimeZoneId())
 && (this.getTransitionTime()==castOther.getTransitionTime());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTimeZoneId();
         result = 37 * result + (int) this.getTransitionTime();
         return result;
   }   


}


