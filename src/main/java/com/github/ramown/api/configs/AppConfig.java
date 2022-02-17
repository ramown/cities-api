package com.github.ramown.api.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.ramown.api.services.DistanceService;

@Configuration
public class AppConfig {
	
	@Bean
	public DistanceService distanceService() {
		return new DistanceService();
	}

}
