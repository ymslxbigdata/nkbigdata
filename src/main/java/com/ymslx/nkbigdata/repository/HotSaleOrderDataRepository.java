package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.HotSaleOrderData;

@Repository
public interface HotSaleOrderDataRepository extends JpaRepository<HotSaleOrderData, String> {
	 List<HotSaleOrderData> findByProductIdContainingAndProductNmContaining(String productId, String productNm);;
}