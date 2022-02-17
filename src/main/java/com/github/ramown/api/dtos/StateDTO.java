package com.github.ramown.api.dtos;

import java.io.Serializable;

import com.github.ramown.api.entities.State;


public class StateDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;
	private String uf;
	private CountryDTO country;
	
	
	public StateDTO() {
	}

	public StateDTO(String name, String uf, CountryDTO country) {
		this.name = name;
		this.uf = uf;
		this.country = country;
	}
	
	public StateDTO(State state) {
		this.name = state.getName();
		this.uf = state.getUf();
		this.country = new CountryDTO(state.getCountry());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}
		
}