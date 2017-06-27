package com.pass.model.domain;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TimeZoneTransitionTypeId  implements java.io.Serializable {


     private int timeZoneId;
     private int transitionTypeId;

    public TimeZoneTransitionTypeId() {
    }

    public TimeZoneTransitionTypeId(int timeZoneId, int transitionTypeId) {
       this.timeZoneId = timeZoneId;
       this.transitionTypeId = transitionTypeId;
    }
   


    @Column(name="Time_zone_id", nullable=false)
    public int getTimeZoneId() {
        return this.timeZoneId;
    }
    
    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    @Column(name="Transition_type_id", nullable=false)
    public int getTransitionTypeId() {
        return this.transitionTypeId;
    }
    
    public void setTransitionTypeId(int transitionTypeId) {
        this.transitionTypeId = transitionTypeId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TimeZoneTransitionTypeId) ) return false;
		 TimeZoneTransitionTypeId castOther = ( TimeZoneTransitionTypeId ) other; 
         
		 return (this.getTimeZoneId()==castOther.getTimeZoneId())
 && (this.getTransitionTypeId()==castOther.getTransitionTypeId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTimeZoneId();
         result = 37 * result + this.getTransitionTypeId();
         return result;
   }   


}


