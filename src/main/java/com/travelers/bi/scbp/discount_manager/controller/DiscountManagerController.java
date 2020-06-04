package com.travelers.bi.scbp.discount_manager.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.travelers.bi.scbp.discount_manager.model.Policy;

@RestController

public class DiscountManagerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path="/discounts")
	@HystrixCommand(fallbackMethod = "callFallback")
	public String retrieveDiscountDetails() {
		String uri="http://localhost:8082/policy";
		Policy policy = restTemplate.getForObject(uri, Policy.class);
		return "success";
	}
	
	 @SuppressWarnings("unused")
	    private String callFallback() {
	 
	        System.out.println("Student Service is down!!! fallback route enabled...");
	 
	        return "CIRCUIT BREAKER ENABLED!!! No Response From Student Service at this moment. " +
	                    " Service will be back shortly - " + new Date();
	    }

}
