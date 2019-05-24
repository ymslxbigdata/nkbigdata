package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.AreaProductData;
import com.ymslx.nkbigdata.repository.AreaProductDataRepository;

@Service
public class AreaProductDataService {

	@Autowired 
	private AreaProductDataRepository areaProductDataRepository;

	public List<AreaProductData> getAreaProductData(String areaId) {
		
		return areaProductDataRepository.findByAreaIdContaining(areaId);
	}
	
	public void saveDatas(AreaProductData areaProductData) {
		
		areaProductDataRepository.save(areaProductData);
	}
	
	public List<AreaProductData> getAreaMonthOutput() {
		return areaProductDataRepository.findAll();
	}
}
