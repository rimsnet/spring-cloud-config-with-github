package com.springcloud.microservices.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {
	
	@Value("${msg}")
    private String msgProfile;
	
	@GetMapping("/msg")
    public String getMsg() {
    	
    	System.out.println("Hey I am In Message Controller");
        return this.msgProfile;
    }

}
