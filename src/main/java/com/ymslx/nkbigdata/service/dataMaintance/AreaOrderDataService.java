package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.AreaOrderData;
import com.ymslx.nkbigdata.repository.AreaOrderDataRepository;

@Service
public class AreaOrderDataService {

	@Autowired 
	private AreaOrderDataRepository areaOrderDataRepository;

	public List<AreaOrderData> getAreaOrderData(String areaId) {
		
		return areaOrderDataRepository.findByAreaIdContaining(areaId);
	}
	
	public void saveDatas(AreaOrderData areaOrderData) {
		
		areaOrderDataRepository.save(areaOrderData);
	}
}
