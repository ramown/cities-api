package com.github.ramown.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ramown.api.entities.Country;
import com.github.ramown.api.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	@Autowired
	private CountryService service;
	
	@GetMapping
	public List<Country> countries(){
		return service.getCountries();
	}
	
	@GetMapping("/pagination")
	public Page<Country> countriesPerPage(Pageable page){
		return service.countriesPerPage(page);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> getOne(@PathVariable Long id){
		try {
			Country obj = service.getCountryById(id).get();
			return ResponseEntity.ok(obj);			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}

}
