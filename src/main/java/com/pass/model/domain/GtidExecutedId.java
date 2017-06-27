package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GtidExecutedId  implements java.io.Serializable {


     private String sourceUuid;
     private long intervalStart;

    public GtidExecutedId() {
    }

    public GtidExecutedId(String sourceUuid, long intervalStart) {
       this.sourceUuid = sourceUuid;
       this.intervalStart = intervalStart;
    }
   


    @Column(name="source_uuid", nullable=false, length=36)
    public String getSourceUuid() {
        return this.sourceUuid;
    }
    
    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }


    @Column(name="interval_start", nullable=false)
    public long getIntervalStart() {
        return this.intervalStart;
    }
    
    public void setIntervalStart(long intervalStart) {
        this.intervalStart = intervalStart;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GtidExecutedId) ) return false;
		 GtidExecutedId castOther = ( GtidExecutedId ) other; 
         
		 return ( (this.getSourceUuid()==castOther.getSourceUuid()) || ( this.getSourceUuid()!=null && castOther.getSourceUuid()!=null && this.getSourceUuid().equals(castOther.getSourceUuid()) ) )
 && (this.getIntervalStart()==castOther.getIntervalStart());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSourceUuid() == null ? 0 : this.getSourceUuid().hashCode() );
         result = 37 * result + (int) this.getIntervalStart();
         return result;
   }   


}


