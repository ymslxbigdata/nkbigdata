package com.ymslx.nkbigdata.service.dataMaintance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymslx.nkbigdata.entity.AreaAdditionalInfo;
import com.ymslx.nkbigdata.repository.AreaAdditionalInfoRepository;

@Service
public class AreaAdditionalInfoService {

	@Autowired 
	private AreaAdditionalInfoRepository areaAdditionalInfoRepository;
	
	public AreaAdditionalInfo getAddtionalInfo() {
		return areaAdditionalInfoRepository.findAll().get(0);
	}
}
