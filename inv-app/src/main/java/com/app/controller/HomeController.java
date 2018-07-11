package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@RequestMapping(value = "/inv_home", method = RequestMethod.GET)
    public String home() {
        System.out.println("Home called");
        
        return "Hi from inv-app...";
    }	
	
}
