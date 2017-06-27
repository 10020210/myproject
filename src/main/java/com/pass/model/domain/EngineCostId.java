package com.pass.model.domain;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EngineCostId  implements java.io.Serializable {


     private String costName;
     private String engineName;
     private int deviceType;

    public EngineCostId() {
    }

    public EngineCostId(String costName, String engineName, int deviceType) {
       this.costName = costName;
       this.engineName = engineName;
       this.deviceType = deviceType;
    }
   


    @Column(name="cost_name", nullable=false, length=64)
    public String getCostName() {
        return this.costName;
    }
    
    public void setCostName(String costName) {
        this.costName = costName;
    }


    @Column(name="engine_name", nullable=false, length=64)
    public String getEngineName() {
        return this.engineName;
    }
    
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }


    @Column(name="device_type", nullable=false)
    public int getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EngineCostId) ) return false;
		 EngineCostId castOther = ( EngineCostId ) other; 
         
		 return ( (this.getCostName()==castOther.getCostName()) || ( this.getCostName()!=null && castOther.getCostName()!=null && this.getCostName().equals(castOther.getCostName()) ) )
 && ( (this.getEngineName()==castOther.getEngineName()) || ( this.getEngineName()!=null && castOther.getEngineName()!=null && this.getEngineName().equals(castOther.getEngineName()) ) )
 && (this.getDeviceType()==castOther.getDeviceType());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCostName() == null ? 0 : this.getCostName().hashCode() );
         result = 37 * result + ( getEngineName() == null ? 0 : this.getEngineName().hashCode() );
         result = 37 * result + this.getDeviceType();
         return result;
   }   


}


