package com.ymslx.nkbigdata.controller.dataMaintacne.leadingCompProductData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.LeadingCompProductData;
import com.ymslx.nkbigdata.service.dataMaintance.LeadingCompProductDataService;

@Controller
@RequestMapping("dataMaintance/leadingCompProductData")
public class LeadingCompProductDataController {
	
	@Autowired 
	LeadingCompProductDataService leadingCompProductDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/leadingCompProductData/leadingCompProductData"; 
	}
	
	//获取龙头企业生产数据
	@RequestMapping(value="getLeadingCompProductData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<LeadingCompProductData> getLeadingCompProductData(@RequestBody final LeadingCompProductData para) {
		return leadingCompProductDataService.getLeadingCompProductData(para); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final LeadingCompProductData para) {
		leadingCompProductDataService.saveDatas(para);
	}
	
	//删除数据
	@RequestMapping(value="deleteData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void deleteData(@RequestBody final LeadingCompProductData para) {
		leadingCompProductDataService.deleteDatas(para);
	}	
	
	
}
