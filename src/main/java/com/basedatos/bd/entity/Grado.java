package com.basedatos.bd.entity;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "GRADO")
public class Grado implements Serializable{

	private static final long serialVersionUID = -558531865446597889L;
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "GRADO")
	private String grado;
	
	@Column(name = "SECCION")
	private String seccion;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
	
	

}
