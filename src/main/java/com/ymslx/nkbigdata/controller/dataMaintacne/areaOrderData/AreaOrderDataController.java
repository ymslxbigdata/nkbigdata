package com.ymslx.nkbigdata.controller.dataMaintacne.areaOrderData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.AreaOrderData;
import com.ymslx.nkbigdata.service.dataMaintance.AreaOrderDataService;

@Controller
@RequestMapping("dataMaintance/areaOrderData")
public class AreaOrderDataController {
	
	@Autowired 
	AreaOrderDataService areaOrderDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/areaOrderData/areaOrderData"; 
	}
	
	//获取园区销售订单数据
	@RequestMapping(value="getAreaOrderData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<AreaOrderData> getAreaOrderData(@RequestBody final AreaOrderData para) {
		return areaOrderDataService.getAreaOrderData(para.getAreaId()); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final AreaOrderData para) {
		areaOrderDataService.saveDatas(para);
	}
}
