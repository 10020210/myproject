package com.airport.model.domain;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="12_Organization_Type"
    ,catalog="pmpml_live"
)
public class OrganizationType  implements java.io.Serializable {


     private int orgTypeId;
     private String orgTypeName;
     private Set<OrganizationList> OrganizationLists = new HashSet<OrganizationList>(0);

    public OrganizationType() {
    }

	
    public OrganizationType(int orgTypeId) {
        this.orgTypeId = orgTypeId;
    }
    public OrganizationType(int orgTypeId, String orgTypeName, Set<OrganizationList> OrganizationLists) {
       this.orgTypeId = orgTypeId;
       this.orgTypeName = orgTypeName;
       this.OrganizationLists = OrganizationLists;
    }
   
     @Id 

    
    @Column(name="org_type_id", unique=true, nullable=false)
    public int getOrgTypeId() {
        return this.orgTypeId;
    }
    
    public void setOrgTypeId(int orgTypeId) {
        this.orgTypeId = orgTypeId;
    }

    
    @Column(name="org_type_name", length=25)
    public String getOrgTypeName() {
        return this.orgTypeName;
    }
    
    public void setOrgTypeName(String orgTypeName) {
        this.orgTypeName = orgTypeName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationType")
    public Set<OrganizationList> getOrganizationLists() {
        return this.OrganizationLists;
    }
    
    public void setOrganizationLists(Set<OrganizationList> OrganizationLists) {
        this.OrganizationLists = OrganizationLists;
    }




}


