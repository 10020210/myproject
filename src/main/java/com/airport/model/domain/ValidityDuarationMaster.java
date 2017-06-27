package com.airport.model.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="03_Validity_Duaration_Master"
    ,catalog="pmpml_live"
    , uniqueConstraints = @UniqueConstraint(columnNames="validity_name") 
)
public class ValidityDuarationMaster  implements java.io.Serializable {


     private Integer validityId;
     private String validityName;
     private Set<PassValidityPrice> PassValidityPrices = new HashSet<PassValidityPrice>(0);

    public ValidityDuarationMaster() {
    }

	
    public ValidityDuarationMaster(String validityName) {
        this.validityName = validityName;
    }
    public ValidityDuarationMaster(String validityName, Set<PassValidityPrice> PassValidityPrices) {
       this.validityName = validityName;
       this.PassValidityPrices = PassValidityPrices;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="validity_id", unique=true, nullable=false)
    public Integer getValidityId() {
        return this.validityId;
    }
    
    public void setValidityId(Integer validityId) {
        this.validityId = validityId;
    }

    
    @Column(name="validity_name", unique=true, nullable=false, length=15)
    public String getValidityName() {
        return this.validityName;
    }
    
    public void setValidityName(String validityName) {
        this.validityName = validityName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="validityDuarationMaster")
    public Set<PassValidityPrice> getPassValidityPrices() {
        return this.PassValidityPrices;
    }
    
    public void setPassValidityPrices(Set<PassValidityPrice> PassValidityPrices) {
        this.PassValidityPrices = PassValidityPrices;
    }




}


