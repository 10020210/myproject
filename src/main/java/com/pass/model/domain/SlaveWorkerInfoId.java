package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SlaveWorkerInfoId  implements java.io.Serializable {


     private String channelName;
     private int id;

    public SlaveWorkerInfoId() {
    }

    public SlaveWorkerInfoId(String channelName, int id) {
       this.channelName = channelName;
       this.id = id;
    }
   


    @Column(name="Channel_name", nullable=false, length=64)
    public String getChannelName() {
        return this.channelName;
    }
    
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }


    @Column(name="Id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SlaveWorkerInfoId) ) return false;
		 SlaveWorkerInfoId castOther = ( SlaveWorkerInfoId ) other; 
         
		 return ( (this.getChannelName()==castOther.getChannelName()) || ( this.getChannelName()!=null && castOther.getChannelName()!=null && this.getChannelName().equals(castOther.getChannelName()) ) )
 && (this.getId()==castOther.getId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getChannelName() == null ? 0 : this.getChannelName().hashCode() );
         result = 37 * result + this.getId();
         return result;
   }   


}


