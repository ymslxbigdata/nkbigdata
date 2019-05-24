package com.ymslx.nkbigdata.controller.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class homePageController {

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
}
