package com.github.ramown.api.utils;

public class GeoLocation {
	// select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
	
	private Long latitude;
	private Long longitude;
	
	public GeoLocation() {
	}
	
	public GeoLocation(Long latitude, Long longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	
	// DLA Diferença entre Latidude
	// DLO Diferença entre Longitude
	
	// DIST² = DLA² + DLO²
	
}

