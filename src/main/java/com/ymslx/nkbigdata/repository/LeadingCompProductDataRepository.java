package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.LeadingCompProductData;

@Repository
public interface LeadingCompProductDataRepository extends JpaRepository<LeadingCompProductData, String> {
	 List<LeadingCompProductData> findByCompIdContainingAndCompNmContaining(String compId, String compNm);;
}