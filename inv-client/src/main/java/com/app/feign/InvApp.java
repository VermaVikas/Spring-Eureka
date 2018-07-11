package com.app.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("inv-app")
public interface InvApp {
	
	@GetMapping(value = "/inv_home")
    public String home();
	
}
