package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TestController {

	@RequestMapping("/test")
    public String getScreen(ModelMap map) {
		
        return "test/test";
    }
}
