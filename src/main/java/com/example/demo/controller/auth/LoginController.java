package com.example.demo.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
//	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	@GetMapping("/login")
    public String login() {
        return "/auth/login";
    }

    @GetMapping({"","/","/index"})
    public String index() {
        return "/home/home";
    }
}

