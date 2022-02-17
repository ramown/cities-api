package com.github.ramown.api.entities;

public class Distance {
	
	private City from;
	private City to;
	
	private Double distance;

	public Distance() {
	}

	public Distance(City from, City to, Double distance) {
		this.from = from;
		this.to = to;
		this.distance = distance;
	}

	public City getFrom() {
		return from;
	}

	public void setFrom(City from) {
		this.from = from;
	}

	public City getTo() {
		return to;
	}

	public void setTo(City to) {
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
