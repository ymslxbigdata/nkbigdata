package com.ymslx.nkbigdata.entity;
// Generated 2019-5-23 10:08:53 by Hibernate Tools 5.2.5.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AreaProductData generated by hbm2java
 */
@Entity
@Table(name="area_product_data"
)
public class AreaProductData  implements java.io.Serializable {


     private String areaId;
     private String areaNm;
     private Long monthProduct;
     private Long monthOutput;

    public AreaProductData() {
    }

	
    public AreaProductData(String areaId) {
        this.areaId = areaId;
    }
    public AreaProductData(String areaId, String areaNm, Long monthProduct, Long monthOutput) {
       this.areaId = areaId;
       this.areaNm = areaNm;
       this.monthProduct = monthProduct;
       this.monthOutput = monthOutput;
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

    
    @Column(name="month_product", precision=12, scale=0)
    public Long getMonthProduct() {
        return this.monthProduct;
    }
    
    public void setMonthProduct(Long monthProduct) {
        this.monthProduct = monthProduct;
    }

    
    @Column(name="month_output", precision=12, scale=0)
    public Long getMonthOutput() {
        return this.monthOutput;
    }
    
    public void setMonthOutput(Long monthOutput) {
        this.monthOutput = monthOutput;
    }




}


