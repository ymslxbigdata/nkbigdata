package com.ymslx.nkbigdata.controller.dataMaintacne.hotSalePlaceOrderData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.HotSalePlaceOrderData;
import com.ymslx.nkbigdata.service.dataMaintance.HotSalePlaceOrderDataService;

@Controller
@RequestMapping("dataMaintance/hotSalePlaceOrderData")
public class HotSalePlaceOrderDataController {
	
	@Autowired 
	HotSalePlaceOrderDataService hotSalePlaceOrderDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/hotSalePlaceOrderData/hotSalePlaceOrderData"; 
	}
	
	//获取热销产品生产数据
	@RequestMapping(value="getHotSalePlaceOrderData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<HotSalePlaceOrderData> getHotSalePlaceOrderData(@RequestBody final HotSalePlaceOrderData para) {
		return hotSalePlaceOrderDataService.getHotSalePlaceOrderData(para); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final HotSalePlaceOrderData para) {
		hotSalePlaceOrderDataService.saveDatas(para);
	}
	
	//删除数据
	@RequestMapping(value="deleteData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void deleteData(@RequestBody final HotSalePlaceOrderData para) {
		hotSalePlaceOrderDataService.deleteDatas(para);
	}	
	
	
}
