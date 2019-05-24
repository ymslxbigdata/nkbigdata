package com.ymslx.nkbigdata.controller.dataMaintacne.leadingCompOrderData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.LeadingCompOrderData;
import com.ymslx.nkbigdata.service.dataMaintance.LeadingCompOrderDataService;

@Controller
@RequestMapping("dataMaintance/leadingCompOrderData")
public class LeadingCompOrderDataController {
	
	@Autowired 
	LeadingCompOrderDataService leadingCompOrderDataService;
	 
	@RequestMapping("/info") 
	public String getScreen(final Model model){
        return "dataMaintance/leadingCompOrderData/leadingCompOrderData"; 
	}
	
	//获取龙头企业销售订单数据
	@RequestMapping(value="getLeadingCompOrderData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public List<LeadingCompOrderData> getLeadingCompOrderData(@RequestBody final LeadingCompOrderData para) {
		return leadingCompOrderDataService.getLeadingCompOrderData(para); 
	}

	//保存数据
	@RequestMapping(value="saveData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void saveData(@RequestBody final LeadingCompOrderData para) {
		leadingCompOrderDataService.saveDatas(para);
	}
	
	//删除数据
	@RequestMapping(value="deleteData" , 
	                method = RequestMethod.POST ,
	                consumes = MediaType.APPLICATION_JSON_VALUE , 
	                produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody public void deleteData(@RequestBody final LeadingCompOrderData para) {
		leadingCompOrderDataService.deleteDatas(para);
	}	
	
	
}
