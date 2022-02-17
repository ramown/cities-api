package com.github.ramown.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.ramown.api.entities.State;
import com.github.ramown.api.services.StateService;

@RestController
@RequestMapping("/states")
public class StateResource {
	
	@Autowired
	private StateService service;
	
	@GetMapping
	public List<State> countries(){
		return service.getStates();
	}
	
	@GetMapping("/pagination")
	public Page<State> statesPerPage(Pageable page){
		return service.statesPerPage(page);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<State> getOne(@PathVariable Long id){
		State obj = service.getStateById(id);
		return ResponseEntity.ok(obj);
	}

}
