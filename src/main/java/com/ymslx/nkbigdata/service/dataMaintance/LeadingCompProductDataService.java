package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.LeadingCompProductData;
import com.ymslx.nkbigdata.repository.LeadingCompProductDataRepository;

@Service
public class LeadingCompProductDataService {

	@Autowired 
	private LeadingCompProductDataRepository leadingCompProductDataRepository;

	public List<LeadingCompProductData> getLeadingCompProductData(LeadingCompProductData leadingCompProductData) {
		
		return leadingCompProductDataRepository.findByCompIdContainingAndCompNmContaining(leadingCompProductData.getCompId(), leadingCompProductData.getCompNm());
	}
	
	public void saveDatas(LeadingCompProductData leadingCompProductData) {
		
		leadingCompProductDataRepository.save(leadingCompProductData);
	}
	
	public void deleteDatas(LeadingCompProductData leadingCompProductData) {
		
		leadingCompProductDataRepository.delete(leadingCompProductData);
	}
}
