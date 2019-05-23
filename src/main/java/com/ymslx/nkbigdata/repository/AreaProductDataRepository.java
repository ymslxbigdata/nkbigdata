package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.AreaProductData;

@Repository
public interface AreaProductDataRepository extends JpaRepository<AreaProductData, String> {
	 List<AreaProductData> findByAreaIdContaining(String areaId);
}