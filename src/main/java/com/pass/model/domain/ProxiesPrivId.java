package com.pass.model.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProxiesPrivId  implements java.io.Serializable {


     private String host;
     private String user;
     private String proxiedHost;
     private String proxiedUser;

    public ProxiesPrivId() {
    }

    public ProxiesPrivId(String host, String user, String proxiedHost, String proxiedUser) {
       this.host = host;
       this.user = user;
       this.proxiedHost = proxiedHost;
       this.proxiedUser = proxiedUser;
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


    @Column(name="Proxied_host", nullable=false, length=60)
    public String getProxiedHost() {
        return this.proxiedHost;
    }
    
    public void setProxiedHost(String proxiedHost) {
        this.proxiedHost = proxiedHost;
    }


    @Column(name="Proxied_user", nullable=false, length=32)
    public String getProxiedUser() {
        return this.proxiedUser;
    }
    
    public void setProxiedUser(String proxiedUser) {
        this.proxiedUser = proxiedUser;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProxiesPrivId) ) return false;
		 ProxiesPrivId castOther = ( ProxiesPrivId ) other; 
         
		 return ( (this.getHost()==castOther.getHost()) || ( this.getHost()!=null && castOther.getHost()!=null && this.getHost().equals(castOther.getHost()) ) )
 && ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getProxiedHost()==castOther.getProxiedHost()) || ( this.getProxiedHost()!=null && castOther.getProxiedHost()!=null && this.getProxiedHost().equals(castOther.getProxiedHost()) ) )
 && ( (this.getProxiedUser()==castOther.getProxiedUser()) || ( this.getProxiedUser()!=null && castOther.getProxiedUser()!=null && this.getProxiedUser().equals(castOther.getProxiedUser()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getHost() == null ? 0 : this.getHost().hashCode() );
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getProxiedHost() == null ? 0 : this.getProxiedHost().hashCode() );
         result = 37 * result + ( getProxiedUser() == null ? 0 : this.getProxiedUser().hashCode() );
         return result;
   }   


}


