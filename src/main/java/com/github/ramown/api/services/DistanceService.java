package com.github.ramown.api.services;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.ramown.api.dtos.DistanceDTO;
import com.github.ramown.api.entities.City;
import com.github.ramown.api.repositories.CityRepository;

@Service
public class DistanceService {
	
	Logger log = LoggerFactory.getLogger(DistanceService.class);
	
	@Autowired
	private CityRepository repository;

	public DistanceDTO distanceByPointsInMiles(Long city1, Long city2) {
		log.info("nativePostgresInMiles ({}, {})", city1, city2);
		
		City obj1 = repository.findById(city1).orElseThrow(
				() -> new EntityNotFoundException("Id not found: " + city1));
		City obj2 = repository.findById(city2).orElseThrow(
				() -> new EntityNotFoundException("Id not found: " + city2));
		
		Double distance = repository.distanceByPoints(city1, city2);
		
		return new DistanceDTO(obj1, obj2, distance);
	}

}
