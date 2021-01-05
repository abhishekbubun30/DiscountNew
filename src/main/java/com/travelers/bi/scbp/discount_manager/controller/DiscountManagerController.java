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
	
	@GetMapping(path="/dicount")
	public String retrieveDiscountDetails() {
		
		return "success";
	}
	

}
