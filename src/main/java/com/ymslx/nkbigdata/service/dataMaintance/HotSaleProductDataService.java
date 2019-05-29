package com.ymslx.nkbigdata.service.dataMaintance;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.HotSaleProductData;
import com.ymslx.nkbigdata.repository.HotSaleProductDataRepository;

@Service
public class HotSaleProductDataService {

	@Autowired 
	private HotSaleProductDataRepository hotSaleProductDataRepository;

	public List<HotSaleProductData> getHotSaleProductData(HotSaleProductData hotSaleProductData) {
		
		return hotSaleProductDataRepository.findByProductIdContainingAndProductNmContaining(hotSaleProductData.getProductId() ,hotSaleProductData.getProductNm());
	}
	
	public void saveDatas(HotSaleProductData hotSaleProductData) {
		
		hotSaleProductDataRepository.save(hotSaleProductData);
	}
	
	public void deleteDatas(HotSaleProductData hotSaleProductData) {
		
		hotSaleProductDataRepository.delete(hotSaleProductData);
	}
	
	public Map<String,Long> getHotSaleMonth( ) {
		
		List<HotSaleProductData> productList = hotSaleProductDataRepository.findAll();
		Map<String,Long> map=new HashMap<>();
		
		for (HotSaleProductData hotSaleProductData : productList) {
			 map.put(hotSaleProductData.getProductNm(),hotSaleProductData.getMonthProduction());		
		}
		
		return map;
	}
	
	public Map<String,Long> getHotSaleYear( ) {
		
		List<HotSaleProductData> productList = hotSaleProductDataRepository.findAll();
		Map<String,Long> map=new HashMap<>();
		
		for (HotSaleProductData hotSaleProductData : productList) {
			 map.put(hotSaleProductData.getProductNm(),hotSaleProductData.getYearProduction());		
		}
		
		return map;
	}
}
