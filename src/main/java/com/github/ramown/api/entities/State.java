package com.github.ramown.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
	@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	private String uf;
	private Integer ibge;
	
//	@Column(name = "pais")
//	private String countryId;
	
	@ManyToOne
	@JoinColumn(name = "pais", referencedColumnName = "id")
	private Country country;
	
	@Type(type = "jsonb")
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "ddd", columnDefinition = "jsonb")
	private List<Integer> ddd;
	
	
	public State() {
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


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public Integer getIbge() {
		return ibge;
	}


	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}


//	public String getCountryId() {
//		return countryId;
//	}
//
//
//	public void setCountryId(String countryId) {
//		this.countryId = countryId;
//	}


	public List<Integer> getDdd() {
		return ddd;
	}


	public void setDdd(List<Integer> ddd) {
		this.ddd = ddd;
	}


	public Country getCountry() {
		return country;
	}



	public void setCountry(Country country) {
		this.country = country;
	}
	
	
	
}
