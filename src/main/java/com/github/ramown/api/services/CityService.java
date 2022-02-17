package com.github.ramown.api.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

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

	public City getCitiesById(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found: " + id));	
	}

}
