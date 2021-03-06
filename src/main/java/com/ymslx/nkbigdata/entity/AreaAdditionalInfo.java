package com.ymslx.nkbigdata.entity;
// Generated 2019-5-23 10:08:53 by Hibernate Tools 5.2.5.Final


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AreaAdditionalInfo generated by hbm2java
 */
@Entity
@Table(name="area_additional_info"
)
public class AreaAdditionalInfo  implements java.io.Serializable {


     private String uuId;
     private Long areaCnt;
     private Long compCnt;
     private Long yearProduction;
     private Long yearOutput;
     private Long currentOrderAmount;
     private BigDecimal orderIncrease;

    public AreaAdditionalInfo() {
    }

	
    public AreaAdditionalInfo(String uuId) {
        this.uuId = uuId;
    }
    public AreaAdditionalInfo(String uuId, Long areaCnt, Long compCnt, Long yearProduction, Long yearOutput, Long currentOrderAmount, BigDecimal orderIncrease) {
       this.uuId = uuId;
       this.areaCnt = areaCnt;
       this.compCnt = compCnt;
       this.yearProduction = yearProduction;
       this.yearOutput = yearOutput;
       this.currentOrderAmount = currentOrderAmount;
       this.orderIncrease = orderIncrease;
    }
   
     @Id 

    
    @Column(name="uu_id", unique=true, nullable=false, length=64)
    public String getUuId() {
        return this.uuId;
    }
    
    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    
    @Column(name="area_cnt", precision=12, scale=0)
    public Long getAreaCnt() {
        return this.areaCnt;
    }
    
    public void setAreaCnt(Long areaCnt) {
        this.areaCnt = areaCnt;
    }

    
    @Column(name="comp_cnt", precision=12, scale=0)
    public Long getCompCnt() {
        return this.compCnt;
    }
    
    public void setCompCnt(Long compCnt) {
        this.compCnt = compCnt;
    }

    
    @Column(name="year_production", precision=12, scale=0)
    public Long getYearProduction() {
        return this.yearProduction;
    }
    
    public void setYearProduction(Long yearProduction) {
        this.yearProduction = yearProduction;
    }

    
    @Column(name="year_output", precision=12, scale=0)
    public Long getYearOutput() {
        return this.yearOutput;
    }
    
    public void setYearOutput(Long yearOutput) {
        this.yearOutput = yearOutput;
    }

    
    @Column(name="current_order_amount", precision=12, scale=0)
    public Long getCurrentOrderAmount() {
        return this.currentOrderAmount;
    }
    
    public void setCurrentOrderAmount(Long currentOrderAmount) {
        this.currentOrderAmount = currentOrderAmount;
    }

    
    @Column(name="order_increase", precision=6)
    public BigDecimal getOrderIncrease() {
        return this.orderIncrease;
    }
    
    public void setOrderIncrease(BigDecimal orderIncrease) {
        this.orderIncrease = orderIncrease;
    }




}


