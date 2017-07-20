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
@Table(name="02_Pass_Subcategory")
public class PassSubcategory  implements java.io.Serializable {


     private Integer passtypeId;
     private PassCategory passCategory;
     private String passtypeName;
     private String status;
     private String typename;
     private Set<PassValidityPrice> PassValidityPrices = new HashSet<PassValidityPrice>(0);

    public PassSubcategory() {
    }

	
    public PassSubcategory(String passtypeName) {
        this.passtypeName = passtypeName;
    }
    public PassSubcategory(PassCategory passCategory, String passtypeName, String status, String typename, Set<PassValidityPrice> PassValidityPrices) {
       this.passCategory = passCategory;
       this.passtypeName = passtypeName;
       this.status = status;
       this.typename = typename;
       this.PassValidityPrices = PassValidityPrices;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="passtype_id", unique=true, nullable=false)
    public Integer getPasstypeId() {
        return this.passtypeId;
    }
    
    public void setPasstypeId(Integer passtypeId) {
        this.passtypeId = passtypeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id")
    public PassCategory getPassCategory() {
        return this.passCategory;
    }
    
    public void setPassCategory(PassCategory passCategory) {
        this.passCategory = passCategory;
    }

    
    @Column(name="passtype_name", nullable=false, length=100)
    public String getPasstypeName() {
        return this.passtypeName;
    }
    
    public void setPasstypeName(String passtypeName) {
        this.passtypeName = passtypeName;
    }

    
    @Column(name="status", length=5)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="Typename", length=70)
    public String getTypename() {
        return this.typename;
    }
    
    public void setTypename(String typename) {
        this.typename = typename;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="passSubcategory")
    public Set<PassValidityPrice> getPassValidityPrices() {
        return this.PassValidityPrices;
    }
    
    public void setPassValidityPrices(Set<PassValidityPrice> PassValidityPrices) {
        this.PassValidityPrices = PassValidityPrices;
    }




}


