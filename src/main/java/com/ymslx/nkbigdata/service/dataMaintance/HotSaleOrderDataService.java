package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.HotSaleOrderData;
import com.ymslx.nkbigdata.entity.HotSalePlaceOrderData;
import com.ymslx.nkbigdata.repository.HotSaleOrderDataRepository;

@Service
public class HotSaleOrderDataService {

	@Autowired 
	private HotSaleOrderDataRepository hotSaleOrderDataRepository;

	public List<HotSaleOrderData> getHotSaleOrderData(HotSaleOrderData hotSaleOrderData) {
		
		return hotSaleOrderDataRepository.findByProductIdContainingAndProductNmContaining(hotSaleOrderData.getProductId() ,hotSaleOrderData.getProductNm());
	}
	
	public void saveDatas(HotSaleOrderData hotSaleOrderData) {
		
		hotSaleOrderDataRepository.save(hotSaleOrderData);
	}
	
	public void deleteDatas(HotSaleOrderData hotSaleOrderData) {
		
		hotSaleOrderDataRepository.delete(hotSaleOrderData);
	}
	
	public Map<String, Long> getHotSaleProductAmout() {
		
		List<HotSaleOrderData> orderList = hotSaleOrderDataRepository.findAll();
		Map<String,Long> map=new HashMap<>();
		
		for (HotSaleOrderData hotSaleOrderData : orderList) {
			 map.put(hotSaleOrderData.getProductNm(),hotSaleOrderData.getOrderAmount());		
		}
		
		return map;
	}
}
