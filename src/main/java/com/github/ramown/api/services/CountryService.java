package com.github.ramown.api.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

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

	public Country getCountryById(Long id) {
		return repository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found: " + id));
	}

}
