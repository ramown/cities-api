package com.github.ramown.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Country implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	@Column(name = "nome_pt")
	private String portuguseName;
	@Column(name = "sigla")
	private String code;
	private String bacen;
	
	
	public Country() {
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

	public String getPortuguseName() {
		return portuguseName;
	}

	public void setPortuguseName(String portuguseName) {
		this.portuguseName = portuguseName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBacen() {
		return bacen;
	}

	public void setBacen(String bacen) {
		this.bacen = bacen;
	}
	
	
}
