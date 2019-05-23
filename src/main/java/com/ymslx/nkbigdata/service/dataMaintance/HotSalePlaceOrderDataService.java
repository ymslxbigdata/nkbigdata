package com.ymslx.nkbigdata.service.dataMaintance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.HotSalePlaceOrderData;
import com.ymslx.nkbigdata.repository.HotSalePlaceOrderDataRepository;

@Service
public class HotSalePlaceOrderDataService {

	@Autowired 
	private HotSalePlaceOrderDataRepository hotSalePlaceOrderDataRepository;

	public List<HotSalePlaceOrderData> getHotSalePlaceOrderData(HotSalePlaceOrderData hotSalePlaceOrderData) {
		
		return hotSalePlaceOrderDataRepository.findByPlaceIdContainingAndPlaceNmContaining(hotSalePlaceOrderData.getPlaceId(), hotSalePlaceOrderData.getPlaceNm());
	}
	
	public void saveDatas(HotSalePlaceOrderData hotSalePlaceOrderData) {
		
		hotSalePlaceOrderDataRepository.save(hotSalePlaceOrderData);
	}
	
	public void deleteDatas(HotSalePlaceOrderData hotSalePlaceOrderData) {
		
		hotSalePlaceOrderDataRepository.delete(hotSalePlaceOrderData);
	}
}
