package com.travelers.bi.scbp.discount_manager.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

@Component
public class PolicyManagerHealthInd implements HealthIndicator{

	@Override
	public Health health() {
		try {
		RestTemplate restTemplate = new RestTemplate();
		JsonNode resp = restTemplate.getForObject("http://localhost:8082/actuator/health", JsonNode.class);
		if(resp.get("ststus").asText().equalsIgnoreCase("UP"))
			return Health.up().build();
		}
		catch(Exception ex) {
			return Health.down().withException(ex).build();
		}
		return Health.down().build();
	}

	
	

}
