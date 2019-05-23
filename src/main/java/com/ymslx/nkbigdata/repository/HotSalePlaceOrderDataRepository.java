package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.HotSaleOrderData;
import com.ymslx.nkbigdata.entity.HotSalePlaceOrderData;

@Repository
public interface HotSalePlaceOrderDataRepository extends JpaRepository<HotSalePlaceOrderData, String> {
	 List<HotSalePlaceOrderData> findByPlaceIdContainingAndPlaceNmContaining(String placeId, String placeNm);;
}