package com.ymslx.nkbigdata.controller.dataMaintacne.hotSaleOrderData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.HotSaleOrderData;
import com.ymslx.nkbigdata.service.dataMaintance.HotSaleOrderDataService;

@Controller
@RequestMapping("dataMaintance/hotSaleOrderData")
public class HotSaleOrderDataController {
	
	@Autowired 
	HotSaleOrderDataService hotSaleOrderDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/hotSaleOrderData/hotSaleOrderData"; 
	}
	
	//获取热销产品生产数据
	@RequestMapping(value="getHotSaleOrderData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<HotSaleOrderData> getHotSaleOrderData(@RequestBody final HotSaleOrderData para) {
		return hotSaleOrderDataService.getHotSaleOrderData(para); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final HotSaleOrderData para) {
		hotSaleOrderDataService.saveDatas(para);
	}
	
	//删除数据
	@RequestMapping(value="deleteData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void deleteData(@RequestBody final HotSaleOrderData para) {
		hotSaleOrderDataService.deleteDatas(para);
	}	
	
	
}
