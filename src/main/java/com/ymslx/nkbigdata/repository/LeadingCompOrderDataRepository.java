package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.LeadingCompOrderData;

@Repository
public interface LeadingCompOrderDataRepository extends JpaRepository<LeadingCompOrderData, String> {
	 List<LeadingCompOrderData> findByCompIdContainingAndCompNmContaining(String compId, String compNm);;
}