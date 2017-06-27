package com.pass.model.domain;

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name="proxies_priv"
    ,catalog="mysql"
)
public class ProxiesPriv  implements java.io.Serializable {


     private ProxiesPrivId id;
     private Date timestamp;
     private boolean withGrant;
     private String grantor;

    public ProxiesPriv() {
    }

    public ProxiesPriv(ProxiesPrivId id, boolean withGrant, String grantor) {
       this.id = id;
       this.withGrant = withGrant;
       this.grantor = grantor;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="host", column=@Column(name="Host", nullable=false, length=60) ), 
        @AttributeOverride(name="user", column=@Column(name="User", nullable=false, length=32) ), 
        @AttributeOverride(name="proxiedHost", column=@Column(name="Proxied_host", nullable=false, length=60) ), 
        @AttributeOverride(name="proxiedUser", column=@Column(name="Proxied_user", nullable=false, length=32) ) } )
    public ProxiesPrivId getId() {
        return this.id;
    }
    
    public void setId(ProxiesPrivId id) {
        this.id = id;
    }

    @Version@Temporal(TemporalType.TIMESTAMP)
    @Column(name="Timestamp", nullable=false, length=19)
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
    @Column(name="With_grant", nullable=false)
    public boolean isWithGrant() {
        return this.withGrant;
    }
    
    public void setWithGrant(boolean withGrant) {
        this.withGrant = withGrant;
    }

    
    @Column(name="Grantor", nullable=false, length=93)
    public String getGrantor() {
        return this.grantor;
    }
    
    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }




}


