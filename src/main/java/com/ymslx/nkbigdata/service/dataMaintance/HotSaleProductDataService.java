package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.List;

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
}
