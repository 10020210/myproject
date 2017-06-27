package com.pass.model.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plugin"
    ,catalog="mysql"
)
public class Plugin  implements java.io.Serializable {


     private String name;
     private String dl;

    public Plugin() {
    }

    public Plugin(String name, String dl) {
       this.name = name;
       this.dl = dl;
    }
   
     @Id 

    
    @Column(name="name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="dl", nullable=false, length=128)
    public String getDl() {
        return this.dl;
    }
    
    public void setDl(String dl) {
        this.dl = dl;
    }




}


