package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.LeadingCompOrderData;
import com.ymslx.nkbigdata.repository.LeadingCompOrderDataRepository;

@Service
public class LeadingCompOrderDataService {

	@Autowired 
	private LeadingCompOrderDataRepository leadingCompOrderDataRepository;

	public List<LeadingCompOrderData> getLeadingCompOrderData(LeadingCompOrderData leadingCompOrderData) {
		
		return leadingCompOrderDataRepository.findByCompIdContainingAndCompNmContaining(leadingCompOrderData.getCompId(), leadingCompOrderData.getCompNm());
	}
	
	public void saveDatas(LeadingCompOrderData leadingCompOrderData) {
		
		leadingCompOrderDataRepository.save(leadingCompOrderData);
	}
	
	public void deleteDatas(LeadingCompOrderData leadingCompOrderData) {
		
		leadingCompOrderDataRepository.delete(leadingCompOrderData);
	}
}
