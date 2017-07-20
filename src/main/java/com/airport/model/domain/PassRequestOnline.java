package com.airport.model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="991_Pass_Request_Online")
public class PassRequestOnline  implements java.io.Serializable {


     private Integer applnRequestNo;
     private int userId;
     private int passtypeId;
     private int validityPasstypeId;
     private String applnStatus;
     private Date applnRequestDate;
     private byte[] applicationFile;
     private String applicationStatus;

    public PassRequestOnline() {
    }

	
    public PassRequestOnline(int userId, int passtypeId, int validityPasstypeId, String applnStatus, Date applnRequestDate) {
        this.userId = userId;
        this.passtypeId = passtypeId;
        this.validityPasstypeId = validityPasstypeId;
        this.applnStatus = applnStatus;
        this.applnRequestDate = applnRequestDate;
    }
    public PassRequestOnline(int userId, int passtypeId, int validityPasstypeId, String applnStatus, Date applnRequestDate, byte[] applicationFile, String applicationStatus) {
       this.userId = userId;
       this.passtypeId = passtypeId;
       this.validityPasstypeId = validityPasstypeId;
       this.applnStatus = applnStatus;
       this.applnRequestDate = applnRequestDate;
       this.applicationFile = applicationFile;
       this.applicationStatus = applicationStatus;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="appln_request_no", unique=true, nullable=false)
    public Integer getApplnRequestNo() {
        return this.applnRequestNo;
    }
    
    public void setApplnRequestNo(Integer applnRequestNo) {
        this.applnRequestNo = applnRequestNo;
    }

    
    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="passtype_id", nullable=false)
    public int getPasstypeId() {
        return this.passtypeId;
    }
    
    public void setPasstypeId(int passtypeId) {
        this.passtypeId = passtypeId;
    }

    
    @Column(name="validityPasstype_id", nullable=false)
    public int getValidityPasstypeId() {
        return this.validityPasstypeId;
    }
    
    public void setValidityPasstypeId(int validityPasstypeId) {
        this.validityPasstypeId = validityPasstypeId;
    }

    
    @Column(name="appln_status", nullable=false, length=17)
    public String getApplnStatus() {
        return this.applnStatus;
    }
    
    public void setApplnStatus(String applnStatus) {
        this.applnStatus = applnStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="appln_request_date", nullable=false, length=19)
    public Date getApplnRequestDate() {
        return this.applnRequestDate;
    }
    
    public void setApplnRequestDate(Date applnRequestDate) {
        this.applnRequestDate = applnRequestDate;
    }

    
    @Column(name="application_file")
    public byte[] getApplicationFile() {
        return this.applicationFile;
    }
    
    public void setApplicationFile(byte[] applicationFile) {
        this.applicationFile = applicationFile;
    }

    
    @Column(name="application_status", length=23)
    public String getApplicationStatus() {
        return this.applicationStatus;
    }
    
    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }




}


