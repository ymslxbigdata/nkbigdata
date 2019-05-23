package com.example.demo.entity;
// Generated 2019-5-23 10:08:53 by Hibernate Tools 5.2.5.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AreaOrderData generated by hbm2java
 */
@Entity
@Table(name="area_order_data"
)
public class AreaOrderData  implements java.io.Serializable {


     private String areaId;
     private String areaNm;
     private Long orderAmount;

    public AreaOrderData() {
    }

	
    public AreaOrderData(String areaId) {
        this.areaId = areaId;
    }
    public AreaOrderData(String areaId, String areaNm, Long orderAmount) {
       this.areaId = areaId;
       this.areaNm = areaNm;
       this.orderAmount = orderAmount;
    }
   
     @Id 

    
    @Column(name="area_id", unique=true, nullable=false, length=4)
    public String getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    
    @Column(name="area_nm", length=32)
    public String getAreaNm() {
        return this.areaNm;
    }
    
    public void setAreaNm(String areaNm) {
        this.areaNm = areaNm;
    }

    
    @Column(name="order_amount", precision=12, scale=0)
    public Long getOrderAmount() {
        return this.orderAmount;
    }
    
    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }




}


