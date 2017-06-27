package com.airport.model.domain;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="117_User_Denomination_Master"
    ,catalog="pmpml_live"
    , uniqueConstraints = @UniqueConstraint(columnNames="payment_id") 
)
public class UserDenominationMaster  implements java.io.Serializable {


     private Integer denominationId;
     private Long paymentId;
     private Integer operatorId;
     private String denominationMode;
     private Date denominationDate;
     private Integer x2000;
     private Integer x1000;
     private Integer x500;
     private Integer x100;
     private Integer x50;
     private Integer x20;
     private Integer x10;
     private Integer x5;
     private Integer x2;
     private Integer x1;
     private BigDecimal cardBal;
     private BigDecimal total;
     private Integer passCenterId;
     private Integer shiftType;

    public UserDenominationMaster() {
    }

    public UserDenominationMaster(Long paymentId, Integer operatorId, String denominationMode, Date denominationDate, Integer x2000, Integer x1000, Integer x500, Integer x100, Integer x50, Integer x20, Integer x10, Integer x5, Integer x2, Integer x1, BigDecimal cardBal, BigDecimal total, Integer passCenterId, Integer shiftType) {
       this.paymentId = paymentId;
       this.operatorId = operatorId;
       this.denominationMode = denominationMode;
       this.denominationDate = denominationDate;
       this.x2000 = x2000;
       this.x1000 = x1000;
       this.x500 = x500;
       this.x100 = x100;
       this.x50 = x50;
       this.x20 = x20;
       this.x10 = x10;
       this.x5 = x5;
       this.x2 = x2;
       this.x1 = x1;
       this.cardBal = cardBal;
       this.total = total;
       this.passCenterId = passCenterId;
       this.shiftType = shiftType;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="denomination_id", unique=true, nullable=false)
    public Integer getDenominationId() {
        return this.denominationId;
    }
    
    public void setDenominationId(Integer denominationId) {
        this.denominationId = denominationId;
    }

    
    @Column(name="payment_id", unique=true)
    public Long getPaymentId() {
        return this.paymentId;
    }
    
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    
    @Column(name="operator_id")
    public Integer getOperatorId() {
        return this.operatorId;
    }
    
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    
    @Column(name="denomination_mode", length=9)
    public String getDenominationMode() {
        return this.denominationMode;
    }
    
    public void setDenominationMode(String denominationMode) {
        this.denominationMode = denominationMode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="denomination_date", length=19)
    public Date getDenominationDate() {
        return this.denominationDate;
    }
    
    public void setDenominationDate(Date denominationDate) {
        this.denominationDate = denominationDate;
    }

    
    @Column(name="2000x")
    public Integer getx2000() {
        return this.x2000;
    }
    
    public void setx2000(Integer x2000) {
        this.x2000 = x2000;
    }

    
    @Column(name="1000x")
    public Integer getx1000() {
        return this.x1000;
    }
    
    public void setx1000(Integer x1000) {
        this.x1000 = x1000;
    }

    
    @Column(name="500x")
    public Integer getx500() {
        return this.x500;
    }
    
    public void setx500(Integer x500) {
        this.x500 = x500;
    }

    
    @Column(name="100x")
    public Integer getx100() {
        return this.x100;
    }
    
    public void setx100(Integer x100) {
        this.x100 = x100;
    }

    
    @Column(name="50x")
    public Integer getx50() {
        return this.x50;
    }
    
    public void setx50(Integer x50) {
        this.x50 = x50;
    }

    
    @Column(name="20x")
    public Integer getx20() {
        return this.x20;
    }
    
    public void setx20(Integer x20) {
        this.x20 = x20;
    }

    
    @Column(name="10x")
    public Integer getx10() {
        return this.x10;
    }
    
    public void setx10(Integer x10) {
        this.x10 = x10;
    }

    
    @Column(name="5x")
    public Integer getx5() {
        return this.x5;
    }
    
    public void setx5(Integer x5) {
        this.x5 = x5;
    }

    
    @Column(name="2x")
    public Integer getx2() {
        return this.x2;
    }
    
    public void setx2(Integer x2) {
        this.x2 = x2;
    }

    
    @Column(name="1x")
    public Integer getx1() {
        return this.x1;
    }
    
    public void setx1(Integer x1) {
        this.x1 = x1;
    }

    
    @Column(name="card_bal", precision=7)
    public BigDecimal getCardBal() {
        return this.cardBal;
    }
    
    public void setCardBal(BigDecimal cardBal) {
        this.cardBal = cardBal;
    }

    
    @Column(name="total", precision=7)
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
    @Column(name="pass_center_id")
    public Integer getPassCenterId() {
        return this.passCenterId;
    }
    
    public void setPassCenterId(Integer passCenterId) {
        this.passCenterId = passCenterId;
    }

    
    @Column(name="shift_type")
    public Integer getShiftType() {
        return this.shiftType;
    }
    
    public void setShiftType(Integer shiftType) {
        this.shiftType = shiftType;
    }




}


