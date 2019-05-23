package com.example.demo.entity;
// Generated 2019-5-23 10:08:53 by Hibernate Tools 5.2.5.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HotSaleProductData generated by hbm2java
 */
@Entity
@Table(name="hot_sale_product_data"
)
public class HotSaleProductData  implements java.io.Serializable {


     private String productId;
     private String productNm;
     private Long monthProduction;
     private Long yearProduction;

    public HotSaleProductData() {
    }

	
    public HotSaleProductData(String productId) {
        this.productId = productId;
    }
    public HotSaleProductData(String productId, String productNm, Long monthProduction, Long yearProduction) {
       this.productId = productId;
       this.productNm = productNm;
       this.monthProduction = monthProduction;
       this.yearProduction = yearProduction;
    }
   
     @Id 

    
    @Column(name="product_id", unique=true, nullable=false, length=16)
    public String getProductId() {
        return this.productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }

    
    @Column(name="product_nm", length=32)
    public String getProductNm() {
        return this.productNm;
    }
    
    public void setProductNm(String productNm) {
        this.productNm = productNm;
    }

    
    @Column(name="month_production", precision=12, scale=0)
    public Long getMonthProduction() {
        return this.monthProduction;
    }
    
    public void setMonthProduction(Long monthProduction) {
        this.monthProduction = monthProduction;
    }

    
    @Column(name="year_production", precision=12, scale=0)
    public Long getYearProduction() {
        return this.yearProduction;
    }
    
    public void setYearProduction(Long yearProduction) {
        this.yearProduction = yearProduction;
    }




}


