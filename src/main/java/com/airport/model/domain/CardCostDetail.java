package com.airport.model.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="11_Card_Cost_Detail")
public class CardCostDetail  implements java.io.Serializable {


     private int costDetailId;
     private BigDecimal costOfMiCard;
     private BigDecimal serviceTax;
     private BigDecimal swatchBharatCess;
     private BigDecimal krishiKalyanCess;
     private BigDecimal convenienceFee;

    public CardCostDetail() {
    }

	
    public CardCostDetail(int costDetailId) {
        this.costDetailId = costDetailId;
    }
    public CardCostDetail(int costDetailId, BigDecimal costOfMiCard, BigDecimal serviceTax, BigDecimal swatchBharatCess, BigDecimal krishiKalyanCess, BigDecimal convenienceFee) {
       this.costDetailId = costDetailId;
       this.costOfMiCard = costOfMiCard;
       this.serviceTax = serviceTax;
       this.swatchBharatCess = swatchBharatCess;
       this.krishiKalyanCess = krishiKalyanCess;
       this.convenienceFee = convenienceFee;
    }
   
     @Id 

    
    @Column(name="Cost_Detail_Id", unique=true, nullable=false)
    public int getCostDetailId() {
        return this.costDetailId;
    }
    
    public void setCostDetailId(int costDetailId) {
        this.costDetailId = costDetailId;
    }

    
    @Column(name="Cost_of_MI_Card", precision=5)
    public BigDecimal getCostOfMiCard() {
        return this.costOfMiCard;
    }
    
    public void setCostOfMiCard(BigDecimal costOfMiCard) {
        this.costOfMiCard = costOfMiCard;
    }

    
    @Column(name="Service Tax", precision=4)
    public BigDecimal getServiceTax() {
        return this.serviceTax;
    }
    
    public void setServiceTax(BigDecimal serviceTax) {
        this.serviceTax = serviceTax;
    }

    
    @Column(name="Swatch Bharat Cess", precision=4)
    public BigDecimal getSwatchBharatCess() {
        return this.swatchBharatCess;
    }
    
    public void setSwatchBharatCess(BigDecimal swatchBharatCess) {
        this.swatchBharatCess = swatchBharatCess;
    }

    
    @Column(name="Krishi Kalyan Cess", precision=4)
    public BigDecimal getKrishiKalyanCess() {
        return this.krishiKalyanCess;
    }
    
    public void setKrishiKalyanCess(BigDecimal krishiKalyanCess) {
        this.krishiKalyanCess = krishiKalyanCess;
    }

    
    @Column(name="Convenience Fee", precision=4)
    public BigDecimal getConvenienceFee() {
        return this.convenienceFee;
    }
    
    public void setConvenienceFee(BigDecimal convenienceFee) {
        this.convenienceFee = convenienceFee;
    }




}


