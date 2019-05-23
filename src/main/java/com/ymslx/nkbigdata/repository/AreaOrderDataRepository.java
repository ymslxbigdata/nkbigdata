package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.AreaOrderData;

@Repository
public interface AreaOrderDataRepository extends JpaRepository<AreaOrderData, String> {
	 List<AreaOrderData> findByAreaIdContaining(String areaId);
}