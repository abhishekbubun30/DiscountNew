package com.travelers.bi.scbp.discount_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class DiscountManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountManagerApplication.class, args);
	}
	
	@Bean
	//@LoadBalanced
	public RestTemplate resttemplate() {
		return new RestTemplate();
	}

}
