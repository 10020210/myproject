package com.pass.model.domain;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserId  implements java.io.Serializable {


     private String host;
     private String user;

    public UserId() {
    }

    public UserId(String host, String user) {
       this.host = host;
       this.user = user;
    }
   


    @Column(name="Host", nullable=false, length=60)
    public String getHost() {
        return this.host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }


    @Column(name="User", nullable=false, length=32)
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserId) ) return false;
		 UserId castOther = ( UserId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         return result;
   }   


}


