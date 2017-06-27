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
@Table(name="10_Edu_Institution_List"
    ,catalog="pmpml_live"
)
public class EduInstitutionList  implements java.io.Serializable {


     private Integer instId;
     private EduInstitutionMaster eduInstitutionMaster;
     private String instName;
     private String instRegnNo;
     private String instAddress;
     private Integer instPhoneNo;
     private String instStatus;

    public EduInstitutionList() {
    }

	
    public EduInstitutionList(EduInstitutionMaster eduInstitutionMaster, String instName) {
        this.eduInstitutionMaster = eduInstitutionMaster;
        this.instName = instName;
    }
    public EduInstitutionList(EduInstitutionMaster eduInstitutionMaster, String instName, String instRegnNo, String instAddress, Integer instPhoneNo, String instStatus) {
       this.eduInstitutionMaster = eduInstitutionMaster;
       this.instName = instName;
       this.instRegnNo = instRegnNo;
       this.instAddress = instAddress;
       this.instPhoneNo = instPhoneNo;
       this.instStatus = instStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Inst_ID", unique=true, nullable=false)
    public Integer getInstId() {
        return this.instId;
    }
    
    public void setInstId(Integer instId) {
        this.instId = instId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Inst_Type_ID", nullable=false)
    public EduInstitutionMaster getEduInstitutionMaster() {
        return this.eduInstitutionMaster;
    }
    
    public void setEduInstitutionMaster(EduInstitutionMaster eduInstitutionMaster) {
        this.eduInstitutionMaster = eduInstitutionMaster;
    }

    
    @Column(name="Inst_Name", nullable=false, length=200)
    public String getInstName() {
        return this.instName;
    }
    
    public void setInstName(String instName) {
        this.instName = instName;
    }

    
    @Column(name="Inst_Regn_No", length=25)
    public String getInstRegnNo() {
        return this.instRegnNo;
    }
    
    public void setInstRegnNo(String instRegnNo) {
        this.instRegnNo = instRegnNo;
    }

    
    @Column(name="Inst_Address", length=150)
    public String getInstAddress() {
        return this.instAddress;
    }
    
    public void setInstAddress(String instAddress) {
        this.instAddress = instAddress;
    }

    
    @Column(name="Inst_Phone_No")
    public Integer getInstPhoneNo() {
        return this.instPhoneNo;
    }
    
    public void setInstPhoneNo(Integer instPhoneNo) {
        this.instPhoneNo = instPhoneNo;
    }

    
    @Column(name="Inst_Status", length=20)
    public String getInstStatus() {
        return this.instStatus;
    }
    
    public void setInstStatus(String instStatus) {
        this.instStatus = instStatus;
    }




}


