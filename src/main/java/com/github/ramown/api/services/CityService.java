package com.github.ramown.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.ramown.api.entities.City;
import com.github.ramown.api.repositories.CityRepository;

@Service
public class CityService {
	
	@Autowired
	private CityRepository repository;
	
	public List<City> getCities() {
		return repository.findAll();
	}

	public Page<City> citiesPerPage(Pageable page) {
		return repository.findAll(page);
	}

	public Optional<City> getCitiesById(Long id) {
		Optional<City> optional = repository.findById(id);
		return optional;
		
	}

}
