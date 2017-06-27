package com.airport.model.domain;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="993_Pass_Master"
    ,catalog="pmpml_live"
)
public class PassMaster  implements java.io.Serializable {


     private Integer passId;
     private PassValidityPrice passValidityPrice;
     private UserPaymentMaster userPaymentMaster;
     private int applnNo;
     private String passStatus;
     private Date startDate;
     private Date endDate;
     private String refNo;

    public PassMaster() {
    }

	
    public PassMaster(PassValidityPrice passValidityPrice, UserPaymentMaster userPaymentMaster, int applnNo) {
        this.passValidityPrice = passValidityPrice;
        this.userPaymentMaster = userPaymentMaster;
        this.applnNo = applnNo;
    }
    public PassMaster(PassValidityPrice passValidityPrice, UserPaymentMaster userPaymentMaster, int applnNo, String passStatus, Date startDate, Date endDate, String refNo) {
       this.passValidityPrice = passValidityPrice;
       this.userPaymentMaster = userPaymentMaster;
       this.applnNo = applnNo;
       this.passStatus = passStatus;
       this.startDate = startDate;
       this.endDate = endDate;
       this.refNo = refNo;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="pass_id", unique=true, nullable=false)
    public Integer getPassId() {
        return this.passId;
    }
    
    public void setPassId(Integer passId) {
        this.passId = passId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="validityPasstype_id", nullable=false)
    public PassValidityPrice getPassValidityPrice() {
        return this.passValidityPrice;
    }
    
    public void setPassValidityPrice(PassValidityPrice passValidityPrice) {
        this.passValidityPrice = passValidityPrice;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="payment_id", nullable=false)
    public UserPaymentMaster getUserPaymentMaster() {
        return this.userPaymentMaster;
    }
    
    public void setUserPaymentMaster(UserPaymentMaster userPaymentMaster) {
        this.userPaymentMaster = userPaymentMaster;
    }

    
    @Column(name="appln_no", nullable=false)
    public int getApplnNo() {
        return this.applnNo;
    }
    
    public void setApplnNo(int applnNo) {
        this.applnNo = applnNo;
    }

    
    @Column(name="pass_status", length=8)
    public String getPassStatus() {
        return this.passStatus;
    }
    
    public void setPassStatus(String passStatus) {
        this.passStatus = passStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="start_date", length=19)
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="end_date", length=19)
    public Date getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    @Column(name="ref_no", length=10)
    public String getRefNo() {
        return this.refNo;
    }
    
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }




}


