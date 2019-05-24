package com.ymslx.nkbigdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ymslx.nkbigdata.entity.LeadingCompOrderData;

@Repository
public interface LeadingCompOrderDataRepository extends JpaRepository<LeadingCompOrderData, String> {
	
	List<LeadingCompOrderData> findByCompIdContainingAndCompNmContaining(String compId, String compNm);
	 
	@Query(value="  SELECT a.comp_nm                            "
		   + "          ,a.order_amount                         "
		   + "          ,b.month_production                     "
		   + "     FROM leading_comp_order_data a               "
		   + "     LEFT OUTER JOIN leading_comp_product_data b  "
		   + "       ON a.comp_id = b.comp_id                   ", nativeQuery= true)
	List<Object[]> getLeadingMonthAnalysis();
}