package com.airport.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="13_Organization_List")
public class OrganizationList  implements java.io.Serializable {


     private Integer orgId;
     private OrganizationType organizationType;
     private String orgName;

    public OrganizationList() {
    }

    public OrganizationList(OrganizationType organizationType, String orgName) {
       this.organizationType = organizationType;
       this.orgName = orgName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="org_id", unique=true, nullable=false)
    public Integer getOrgId() {
        return this.orgId;
    }
    
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="org_type_id")
    public OrganizationType getOrganizationType() {
        return this.organizationType;
    }
    
    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    
    @Column(name="org_name", length=45)
    public String getOrgName() {
        return this.orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }




}


