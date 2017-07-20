package com.airport.model.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="115_User_Payment_Master")
public class UserPaymentMaster  implements java.io.Serializable {


     private long paymentId;
     private int userId;
     private int passtypeId;
     private int validityPasstypeId;
     private BigDecimal amount;
     private String paymentType;
     private String modeOfPayment;
     private String modeOfOnlinepay;
     private Date transactionDate;
     private String paymentStatus;
     private Integer operatorId;
     private Integer shiftType;
     private BigDecimal micard;
     private BigDecimal serviceTax;
     private BigDecimal sbcess;
     private BigDecimal krishi;
     private BigDecimal convefees;
     private BigDecimal passAmount;
     private Set<PassMaster> PassMasters = new HashSet<PassMaster>(0);

    public UserPaymentMaster() {
    }

	
    public UserPaymentMaster(long paymentId, int userId, int passtypeId, int validityPasstypeId, BigDecimal amount, String paymentType, String modeOfPayment, Date transactionDate) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.passtypeId = passtypeId;
        this.validityPasstypeId = validityPasstypeId;
        this.amount = amount;
        this.paymentType = paymentType;
        this.modeOfPayment = modeOfPayment;
        this.transactionDate = transactionDate;
    }
    public UserPaymentMaster(long paymentId, int userId, int passtypeId, int validityPasstypeId, BigDecimal amount, String paymentType, String modeOfPayment, String modeOfOnlinepay, Date transactionDate, String paymentStatus, Integer operatorId, Integer shiftType, BigDecimal micard, BigDecimal serviceTax, BigDecimal sbcess, BigDecimal krishi, BigDecimal convefees, BigDecimal passAmount, Set<PassMaster> PassMasters) {
       this.paymentId = paymentId;
       this.userId = userId;
       this.passtypeId = passtypeId;
       this.validityPasstypeId = validityPasstypeId;
       this.amount = amount;
       this.paymentType = paymentType;
       this.modeOfPayment = modeOfPayment;
       this.modeOfOnlinepay = modeOfOnlinepay;
       this.transactionDate = transactionDate;
       this.paymentStatus = paymentStatus;
       this.operatorId = operatorId;
       this.shiftType = shiftType;
       this.micard = micard;
       this.serviceTax = serviceTax;
       this.sbcess = sbcess;
       this.krishi = krishi;
       this.convefees = convefees;
       this.passAmount = passAmount;
       this.PassMasters = PassMasters;
    }
   
     @Id 

    
    @Column(name="payment_id", unique=true, nullable=false)
    public long getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
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

    
    @Column(name="amount", nullable=false, precision=10)
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
    @Column(name="payment_type", nullable=false, length=3)
    public String getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    
    @Column(name="mode_of_payment", nullable=false, length=6)
    public String getModeOfPayment() {
        return this.modeOfPayment;
    }
    
    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    
    @Column(name="mode_of_onlinepay", length=20)
    public String getModeOfOnlinepay() {
        return this.modeOfOnlinepay;
    }
    
    public void setModeOfOnlinepay(String modeOfOnlinepay) {
        this.modeOfOnlinepay = modeOfOnlinepay;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="transaction_date", nullable=false, length=19)
    public Date getTransactionDate() {
        return this.transactionDate;
    }
    
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    
    @Column(name="payment_status", length=20)
    public String getPaymentStatus() {
        return this.paymentStatus;
    }
    
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    
    @Column(name="operator_id")
    public Integer getOperatorId() {
        return this.operatorId;
    }
    
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    
    @Column(name="shift_type")
    public Integer getShiftType() {
        return this.shiftType;
    }
    
    public void setShiftType(Integer shiftType) {
        this.shiftType = shiftType;
    }

    
    @Column(name="micard", precision=10)
    public BigDecimal getMicard() {
        return this.micard;
    }
    
    public void setMicard(BigDecimal micard) {
        this.micard = micard;
    }

    
    @Column(name="service_tax", precision=10)
    public BigDecimal getServiceTax() {
        return this.serviceTax;
    }
    
    public void setServiceTax(BigDecimal serviceTax) {
        this.serviceTax = serviceTax;
    }

    
    @Column(name="sbcess", precision=10)
    public BigDecimal getSbcess() {
        return this.sbcess;
    }
    
    public void setSbcess(BigDecimal sbcess) {
        this.sbcess = sbcess;
    }

    
    @Column(name="krishi", precision=10)
    public BigDecimal getKrishi() {
        return this.krishi;
    }
    
    public void setKrishi(BigDecimal krishi) {
        this.krishi = krishi;
    }

    
    @Column(name="convefees", precision=10)
    public BigDecimal getConvefees() {
        return this.convefees;
    }
    
    public void setConvefees(BigDecimal convefees) {
        this.convefees = convefees;
    }

    
    @Column(name="pass_amount", precision=10)
    public BigDecimal getPassAmount() {
        return this.passAmount;
    }
    
    public void setPassAmount(BigDecimal passAmount) {
        this.passAmount = passAmount;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userPaymentMaster")
    public Set<PassMaster> getPassMasters() {
        return this.PassMasters;
    }
    
    public void setPassMasters(Set<PassMaster> PassMasters) {
        this.PassMasters = PassMasters;
    }




}


