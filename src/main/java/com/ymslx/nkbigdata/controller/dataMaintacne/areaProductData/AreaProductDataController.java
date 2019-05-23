package com.ymslx.nkbigdata.controller.dataMaintacne.areaProductData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.AreaProductData;
import com.ymslx.nkbigdata.service.dataMaintance.AreaProductDataService;

@Controller
@RequestMapping("dataMaintance/areaProductData")
public class AreaProductDataController {
	
	@Autowired 
	AreaProductDataService areaProductDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/areaProductData/areaProductData"; 
	}
	
	//获取园区生产数据
	@RequestMapping(value="getAreaProductData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<AreaProductData> getAreaProductData(@RequestBody final AreaProductData para) {
		return areaProductDataService.getAreaProductData(para.getAreaId()); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final AreaProductData para) {
		areaProductDataService.saveDatas(para);
	}
	
}
