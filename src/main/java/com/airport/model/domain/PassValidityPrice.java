package com.airport.model.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="04_Pass_Validity_Price")
public class PassValidityPrice  implements java.io.Serializable {


     private Integer validityPasstypeId;
     private PassSubcategory passSubcategory;
     private ValidityDuarationMaster validityDuarationMaster;
     private int amount;
     private Set<PassMaster> PassMasters = new HashSet<PassMaster>(0);

    public PassValidityPrice() {
    }

	
    public PassValidityPrice(PassSubcategory passSubcategory, ValidityDuarationMaster validityDuarationMaster, int amount) {
        this.passSubcategory = passSubcategory;
        this.validityDuarationMaster = validityDuarationMaster;
        this.amount = amount;
    }
    public PassValidityPrice(PassSubcategory passSubcategory, ValidityDuarationMaster validityDuarationMaster, int amount, Set<PassMaster> PassMasters) {
       this.passSubcategory = passSubcategory;
       this.validityDuarationMaster = validityDuarationMaster;
       this.amount = amount;
       this.PassMasters = PassMasters;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="validityPasstype_id", unique=true, nullable=false)
    public Integer getValidityPasstypeId() {
        return this.validityPasstypeId;
    }
    
    public void setValidityPasstypeId(Integer validityPasstypeId) {
        this.validityPasstypeId = validityPasstypeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="passtype_id", nullable=false)
    public PassSubcategory getPassSubcategory() {
        return this.passSubcategory;
    }
    
    public void setPassSubcategory(PassSubcategory passSubcategory) {
        this.passSubcategory = passSubcategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="validity_id", nullable=false)
    public ValidityDuarationMaster getValidityDuarationMaster() {
        return this.validityDuarationMaster;
    }
    
    public void setValidityDuarationMaster(ValidityDuarationMaster validityDuarationMaster) {
        this.validityDuarationMaster = validityDuarationMaster;
    }

    
    @Column(name="amount", nullable=false, precision=7, scale=0)
    public int getAmount() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="passValidityPrice")
    public Set<PassMaster> getPassMasters() {
        return this.PassMasters;
    }
    
    public void setPassMasters(Set<PassMaster> PassMasters) {
        this.PassMasters = PassMasters;
    }




}


