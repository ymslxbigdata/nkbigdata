package com.ymslx.nkbigdata.controller.homepage;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymslx.nkbigdata.entity.AreaAdditionalInfo;
import com.ymslx.nkbigdata.entity.AreaProductData;
import com.ymslx.nkbigdata.service.dataMaintance.AreaAdditionalInfoService;
import com.ymslx.nkbigdata.service.dataMaintance.AreaOrderDataService;
import com.ymslx.nkbigdata.service.dataMaintance.AreaProductDataService;
import com.ymslx.nkbigdata.service.dataMaintance.HotSaleOrderDataService;
import com.ymslx.nkbigdata.service.dataMaintance.HotSalePlaceOrderDataService;
import com.ymslx.nkbigdata.service.dataMaintance.HotSaleProductDataService;
import com.ymslx.nkbigdata.service.dataMaintance.LeadingCompOrderDataService;

@Controller
@RequestMapping("/dashboard")
public class homePageController {

	@Autowired
	AreaAdditionalInfoService areaAdditionalInfoService;
	@Autowired
	AreaProductDataService areaProductDataService;
	@Autowired
	AreaOrderDataService areaOrderDataService;
	@Autowired
	HotSaleProductDataService hotSaleProductDataService;
	@Autowired
	LeadingCompOrderDataService leadingCompOrderDataService;
	@Autowired
	HotSalePlaceOrderDataService hotSalePlaceOrderDataService;
	@Autowired
	HotSaleOrderDataService hotSaleOrderDataService;
	
	@RequestMapping("/areaMonthOutput")
	public String getAreaMonthOutputChart() {
		return "charts/areaMonthOutput";
	}
	
	@RequestMapping("/areaSalesOrderAnalysis")
	public String getAreaSalesOrderAnalysisChart() {
		return "charts/areaSalesOrderAnalysis";
	}
	
	@RequestMapping("/leadingMonthAnalysis")
	public String getLeadingMonthAnalysisChart() {
		return "charts/leadingMonthAnalysis";
	}
	
	@RequestMapping("/hotSaleMonth")
	public String getHotSaleMonthChart() {
		return "charts/hotSaleMonth";
	}
	
	@RequestMapping("/hotSaleYear")
	public String getHotSaleYearChart() {
		return "charts/hotSaleYear";
	}
	
	@RequestMapping("/hotSaleAreaAmout")
	public String getHotSaleAreaAmoutChart() {
		return "charts/hotSaleAreaAmout";
	}
	
	@RequestMapping("/hotSaleProductAmout")
	public String getHotSaleProductAmoutChart() {
		return "charts/hotSaleProductAmout";
	}
	
	@RequestMapping(value="getAddtionalInfo"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public AreaAdditionalInfo getAddtionalInfo() {
		return areaAdditionalInfoService.getAddtionalInfo();
	}
	
	@RequestMapping(value="getAreaMonthOutput"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public List<AreaProductData> getAreaMonthOutput() {
		return areaProductDataService.getAreaMonthOutput();
	}
	
	@RequestMapping(value="getAreaSalesOrderAnalysis"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	
	@ResponseBody
	public Map<String, Long> getAreaSalesOrderAnalysis() {
		return areaOrderDataService.getAreaSalesOrderAnalysis();
	}
	
	@RequestMapping(value="getHotSaleMonth"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public Map<String,Long> getHotSaleMonth() {
		return hotSaleProductDataService.getHotSaleMonth();
	}
	
	@RequestMapping(value="getHotSaleYear"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public Map<String,Long> getHotSaleYear() {
		return hotSaleProductDataService.getHotSaleYear();
	}
	
	@RequestMapping(value="getLeadingMonthAnalysis"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public List<Object[]> getLeadingMonthAnalysis() {
		return leadingCompOrderDataService.getLeadingMonthAnalysis();
	}
	
	@RequestMapping(value="getHotSaleAreaAmout"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public Map<String,Long> getHotSaleAreaAmout() {
		return hotSalePlaceOrderDataService.getHotSaleAreaAmout();
	}
	
	@RequestMapping(value="getHotSaleProductAmout"
			, method = RequestMethod.POST
			, consumes = MediaType.APPLICATION_JSON_VALUE
			, produces = MediaType.APPLICATION_JSON_VALUE
	)
	@ResponseBody
	public Map<String,Long> getHotSaleProductAmout() {
		return hotSaleOrderDataService.getHotSaleProductAmout();
	}
}
