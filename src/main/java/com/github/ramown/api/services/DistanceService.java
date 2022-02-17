package com.github.ramown.api.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.ramown.api.dtos.DistanceDTO;
import com.github.ramown.api.repositories.CityRepository;

public class DistanceService {
	
	Logger log = LoggerFactory.getLogger(DistanceService.class);
	
	@Autowired
	private CityRepository repository;

	public DistanceDTO distanceByPointsInMiles(Long city1, Long city2) {
		log.info("nativePostgresInMiles ({}, {})", city1, city2);
		Double distance = repository.distanceByPoints(city1, city2);
		
		return new DistanceDTO(repository.findById(city1).get(), repository.findById(city2).get(), distance);
	}

}
