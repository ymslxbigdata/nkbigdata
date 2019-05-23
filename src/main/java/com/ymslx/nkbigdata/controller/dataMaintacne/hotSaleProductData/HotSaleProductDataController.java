package com.ymslx.nkbigdata.controller.dataMaintacne.hotSaleProductData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.HotSaleProductData;
import com.ymslx.nkbigdata.service.dataMaintance.HotSaleProductDataService;

@Controller
@RequestMapping("dataMaintance/hotSaleProductData")
public class HotSaleProductDataController {
	
	@Autowired 
	HotSaleProductDataService hotSaleProductDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/hotSaleProductData/hotSaleProductData"; 
	}
	
	//获取热销产品生产数据
	@RequestMapping(value="getHotSaleProductData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<HotSaleProductData> getHotSaleProductData(@RequestBody final HotSaleProductData para) {
		return hotSaleProductDataService.getHotSaleProductData(para); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final HotSaleProductData para) {
		hotSaleProductDataService.saveDatas(para);
	}
	
	//删除数据
	@RequestMapping(value="deleteData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void deleteData(@RequestBody final HotSaleProductData para) {
		hotSaleProductDataService.deleteDatas(para);
	}	
	
	
}
