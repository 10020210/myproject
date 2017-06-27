package com.airport.model.domain;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="771_micard_Master"
    ,catalog="pmpml_live"
    , uniqueConstraints = {@UniqueConstraint(columnNames="chip_no"), @UniqueConstraint(columnNames="batch_no")} 
)
public class MicardMaster  implements java.io.Serializable {


     private long micardNo;
     private String chipNo;
     private Long batchNo;
     private Integer userId;
     private Date assignedDate;
     private String cardStatus;
     private Integer categoryId;
     private String deactivateComment;
     private Date deactivatedRequestDate;
     private Integer deacivatedUserId;

    public MicardMaster() {
    }

	
    public MicardMaster(long micardNo) {
        this.micardNo = micardNo;
    }
    public MicardMaster(long micardNo, String chipNo, Long batchNo, Integer userId, Date assignedDate, String cardStatus, Integer categoryId, String deactivateComment, Date deactivatedRequestDate, Integer deacivatedUserId) {
       this.micardNo = micardNo;
       this.chipNo = chipNo;
       this.batchNo = batchNo;
       this.userId = userId;
       this.assignedDate = assignedDate;
       this.cardStatus = cardStatus;
       this.categoryId = categoryId;
       this.deactivateComment = deactivateComment;
       this.deactivatedRequestDate = deactivatedRequestDate;
       this.deacivatedUserId = deacivatedUserId;
    }
   
     @Id 

    
    @Column(name="micard_no", unique=true, nullable=false)
    public long getMicardNo() {
        return this.micardNo;
    }
    
    public void setMicardNo(long micardNo) {
        this.micardNo = micardNo;
    }

    
    @Column(name="chip_no", unique=true, length=15)
    public String getChipNo() {
        return this.chipNo;
    }
    
    public void setChipNo(String chipNo) {
        this.chipNo = chipNo;
    }

    
    @Column(name="batch_no", unique=true)
    public Long getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(Long batchNo) {
        this.batchNo = batchNo;
    }

    
    @Column(name="user_id")
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="assigned_date", length=19)
    public Date getAssignedDate() {
        return this.assignedDate;
    }
    
    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    
    @Column(name="card_status", length=8)
    public String getCardStatus() {
        return this.cardStatus;
    }
    
    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    
    @Column(name="category_id")
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="deactivate_comment", length=180)
    public String getDeactivateComment() {
        return this.deactivateComment;
    }
    
    public void setDeactivateComment(String deactivateComment) {
        this.deactivateComment = deactivateComment;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="deactivated_request_date", length=19)
    public Date getDeactivatedRequestDate() {
        return this.deactivatedRequestDate;
    }
    
    public void setDeactivatedRequestDate(Date deactivatedRequestDate) {
        this.deactivatedRequestDate = deactivatedRequestDate;
    }

    
    @Column(name="deacivated_user_id")
    public Integer getDeacivatedUserId() {
        return this.deacivatedUserId;
    }
    
    public void setDeacivatedUserId(Integer deacivatedUserId) {
        this.deacivatedUserId = deacivatedUserId;
    }




}


