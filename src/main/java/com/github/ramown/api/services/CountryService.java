package com.github.ramown.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.ramown.api.entities.Country;
import com.github.ramown.api.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repository;
	
	public List<Country> getCountries() {
		return repository.findAll();
	}

	public Page<Country> countriesPerPage(Pageable page) {
		return repository.findAll(page);
	}

	public Optional<Country> getCountryById(Long id) {
		Optional<Country> optional = repository.findById(id);
		return optional;
		
	}

}
