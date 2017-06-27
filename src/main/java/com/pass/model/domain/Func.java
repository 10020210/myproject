package com.pass.model.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="func"
    ,catalog="mysql"
)
public class Func  implements java.io.Serializable {


     private String name;
     private boolean ret;
     private String dl;
     private String type;

    public Func() {
    }

    public Func(String name, boolean ret, String dl, String type) {
       this.name = name;
       this.ret = ret;
       this.dl = dl;
       this.type = type;
    }
   
     @Id 

    
    @Column(name="name", unique=true, nullable=false, length=64)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ret", nullable=false)
    public boolean isRet() {
        return this.ret;
    }
    
    public void setRet(boolean ret) {
        this.ret = ret;
    }

    
    @Column(name="dl", nullable=false, length=128)
    public String getDl() {
        return this.dl;
    }
    
    public void setDl(String dl) {
        this.dl = dl;
    }

    
    @Column(name="type", nullable=false, length=9)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }




}


