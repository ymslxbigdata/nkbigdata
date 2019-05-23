package com.example.demo.entity;
// Generated 2019-5-23 10:08:53 by Hibernate Tools 5.2.5.Final


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HotSalePlaceOrderData generated by hbm2java
 */
@Entity
@Table(name="hot_sale_place_order_data"
)
public class HotSalePlaceOrderData  implements java.io.Serializable {


     private HotSalePlaceOrderDataId id;

    public HotSalePlaceOrderData() {
    }

    public HotSalePlaceOrderData(HotSalePlaceOrderDataId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="placeId", column=@Column(name="place_id", nullable=false, length=24) ), 
        @AttributeOverride(name="placeNm", column=@Column(name="place_nm", nullable=false, length=24) ), 
        @AttributeOverride(name="orderAmount", column=@Column(name="order_amount", precision=12, scale=0) ) } )
    public HotSalePlaceOrderDataId getId() {
        return this.id;
    }
    
    public void setId(HotSalePlaceOrderDataId id) {
        this.id = id;
    }




}


