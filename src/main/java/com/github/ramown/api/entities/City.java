package com.github.ramown.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;


@Entity(name = "City")
@Table(name = "cidade")
@TypeDefs({
	@TypeDef(name = "point", typeClass = PointType.class)
})
public class City implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	private Integer ibge;
	
	@Column(name = "cod_tom")
	private Integer codTom;
		
	@ManyToOne
	@JoinColumn(name = "uf", referencedColumnName = "id")
	private State state;
	
	@Type(type = "point")
	@Column(name = "lat_lon", updatable = false, insertable = false)
	private Point geoLocation;
	
	private Long latitude;
	private Long longitude;
		
	public City() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getCodTom() {
		return codTom;
	}

	public void setCodTom(Integer codTom) {
		this.codTom = codTom;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}


	public Point getGeoLocation() {
		return geoLocation;
	}


	public void setGeoLocation(Point geoLocation) {
		this.geoLocation = geoLocation;
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
	
	
	
}
