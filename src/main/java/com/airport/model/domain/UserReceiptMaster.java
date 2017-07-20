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
@Table(name="116_User_Receipt_Master")
public class UserReceiptMaster  implements java.io.Serializable {


     private Integer receiptNo;
     private long paymentId;
     private Date receiptDate;
     private String receiptMode;
     private Integer receiptGeneratedBy;

    public UserReceiptMaster() {
    }

	
    public UserReceiptMaster(long paymentId, Date receiptDate) {
        this.paymentId = paymentId;
        this.receiptDate = receiptDate;
    }
    public UserReceiptMaster(long paymentId, Date receiptDate, String receiptMode, Integer receiptGeneratedBy) {
       this.paymentId = paymentId;
       this.receiptDate = receiptDate;
       this.receiptMode = receiptMode;
       this.receiptGeneratedBy = receiptGeneratedBy;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="receipt_no", unique=true, nullable=false)
    public Integer getReceiptNo() {
        return this.receiptNo;
    }
    
    public void setReceiptNo(Integer receiptNo) {
        this.receiptNo = receiptNo;
    }

    
    @Column(name="payment_id", nullable=false)
    public long getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="receipt_date", nullable=false, length=19)
    public Date getReceiptDate() {
        return this.receiptDate;
    }
    
    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    
    @Column(name="receipt_mode", length=6)
    public String getReceiptMode() {
        return this.receiptMode;
    }
    
    public void setReceiptMode(String receiptMode) {
        this.receiptMode = receiptMode;
    }

    
    @Column(name="receipt_generated_by")
    public Integer getReceiptGeneratedBy() {
        return this.receiptGeneratedBy;
    }
    
    public void setReceiptGeneratedBy(Integer receiptGeneratedBy) {
        this.receiptGeneratedBy = receiptGeneratedBy;
    }




}


