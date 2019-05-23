package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.HotSaleProductData;

@Repository
public interface HotSaleProductDataRepository extends JpaRepository<HotSaleProductData, String> {
	 List<HotSaleProductData> findByProductIdContainingAndProductNmContaining(String productId, String productNm);;
}