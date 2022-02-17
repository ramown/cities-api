package com.github.ramown.api.dtos;



import java.io.Serializable;

import com.github.ramown.api.entities.Country;

public class CountryDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;

	
	public CountryDTO() {
	}

	public CountryDTO(String name) {
		this.name = name;
	}
	
	public CountryDTO(Country country) {
		this.name = country.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
