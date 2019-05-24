package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public Map<String, Long> getAreaSalesOrderAnalysis() {
		
		List<AreaOrderData> orderList = areaOrderDataRepository.findAll();
		Map<String,Long> map=new HashMap<>();
		
		for (AreaOrderData areaOrderData : orderList) {
			 map.put(areaOrderData.getAreaNm(), areaOrderData.getOrderAmount());		
		}
		
		return map;
	}
}
