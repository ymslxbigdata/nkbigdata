package com.ymslx.nkbigdata.controller.dataMaintacne;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dataMaintance")
public class DataMantanceController {

	
	  @RequestMapping("/dataHome") 
	  public String getScreen(final Model model){
		  return "dataMaintance/dataHome"; 
	  }
}
