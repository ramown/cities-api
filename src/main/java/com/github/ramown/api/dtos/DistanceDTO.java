package com.github.ramown.api.dtos;

import java.io.Serializable;

import com.github.ramown.api.entities.City;

public class DistanceDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private CityDTO from;
	private CityDTO to;
	private Double distance;
	
	public DistanceDTO() {
	}

	public DistanceDTO(CityDTO from, CityDTO to, Double distance) {
		this.from = from;
		this.to = to;
		this.distance = distance;
	}

	public DistanceDTO(City city1, City city2, Double distance) {
		this.from = new CityDTO(city1);
		this.to = new CityDTO(city2);
		this.distance = distance;
	}

	public CityDTO getFrom() {
		return from;
	}

	public void setFrom(CityDTO from) {
		this.from = from;
	}

	public CityDTO getTo() {
		return to;
	}

	public void setTo(CityDTO to) {
		this.to = to;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
	
	public Double getDistanceInKm() {
		return distance * 1.60934;
	}
	
	

}
