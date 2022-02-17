package com.github.ramown.api.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

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

	public State getStateById(Long id) {
		return repository.findById(id).orElseThrow(
			() -> new EntityNotFoundException("Id not found: " + id));
	}

}
