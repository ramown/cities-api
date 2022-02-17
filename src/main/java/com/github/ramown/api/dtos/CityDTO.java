package com.github.ramown.api.dtos;

import java.io.Serializable;

import org.springframework.data.geo.Point;

import com.github.ramown.api.entities.City;

public class CityDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer ibge;
	private StateDTO state;	
	private Point geoLocation;
	
	public CityDTO() {
	}

	public CityDTO(String name, Integer ibge, StateDTO state, Point geoLocation) {
		this.name = name;
		this.ibge = ibge;
		this.state = state;
		this.geoLocation = geoLocation;
	}
	
	public CityDTO(City city) {
		this.name = city.getName();
		this.ibge = city.getIbge();
		this.state = new StateDTO(city.getState());
		this.geoLocation = city.getGeoLocation();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIbge() {
		return ibge;
	}

	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}

	public StateDTO getState() {
		return state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}

	public Point getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(Point geoLocation) {
		this.geoLocation = geoLocation;
	}
	
	
	
	

}
