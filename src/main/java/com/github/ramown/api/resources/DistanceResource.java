package com.github.ramown.api.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.ramown.api.dtos.DistanceDTO;
import com.github.ramown.api.services.DistanceService;

@RestController
@RequestMapping("/distances")
public class DistanceResource {
	
	Logger log = LoggerFactory.getLogger(DistanceResource.class);
	
	@Autowired
	private DistanceService service;
	
	@GetMapping("/by-points")
	public ResponseEntity<DistanceDTO> byPoints(@RequestParam(name="from") final Long city1,
			@RequestParam(name="to") final Long city2) {
		log.info("byPoints");
		return ResponseEntity.ok(service.distanceByPointsInMiles(city1, city2));
	}

}
