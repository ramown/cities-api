package com.github.ramown.api.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ramown.api.entities.City;
import com.github.ramown.api.services.CityService;

@RestController
@RequestMapping("/cities")
public class CityResource {
	
	@Autowired
	private CityService service;
	
	@GetMapping
	public Page<City> citiesPerPage(Pageable page){
		return service.citiesPerPage(page);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<City> getOne(@PathVariable Long id){
		try {
			City obj = service.getCitiesById(id).get();
			return ResponseEntity.ok(obj);			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}

}
