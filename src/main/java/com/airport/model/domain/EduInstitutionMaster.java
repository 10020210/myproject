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


@Entity
@Table(name="09_Edu_Institution_Master"
    ,catalog="pmpml_live"
)
public class EduInstitutionMaster  implements java.io.Serializable {


     private Integer instTypeId;
     private String instType;
     private Set<EduInstitutionList> eduInstitutionLists = new HashSet<EduInstitutionList>(0);

    public EduInstitutionMaster() {
    }

	
    public EduInstitutionMaster(String instType) {
        this.instType = instType;
    }
    public EduInstitutionMaster(String instType, Set<EduInstitutionList> eduInstitutionLists) {
       this.instType = instType;
       this.eduInstitutionLists = eduInstitutionLists;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Inst_Type_Id", unique=true, nullable=false)
    public Integer getInstTypeId() {
        return this.instTypeId;
    }
    
    public void setInstTypeId(Integer instTypeId) {
        this.instTypeId = instTypeId;
    }

    
    @Column(name="Inst_Type", nullable=false, length=25)
    public String getInstType() {
        return this.instType;
    }
    
    public void setInstType(String instType) {
        this.instType = instType;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="eduInstitutionMaster")
    public Set<EduInstitutionList> getEduInstitutionLists() {
        return this.eduInstitutionLists;
    }
    
    public void setEduInstitutionLists(Set<EduInstitutionList> eduInstitutionLists) {
        this.eduInstitutionLists = eduInstitutionLists;
    }




}


