package com.github.ramown.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.ramown.api.entities.State;
import com.github.ramown.api.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository repository;
	
	public List<State> getStates() {
		return repository.findAll();
	}

	public Page<State> statesPerPage(Pageable page) {
		return repository.findAll(page);
	}

	public Optional<State> getStateById(Long id) {
		Optional<State> optional = repository.findById(id);
		return optional;
		
	}

}
