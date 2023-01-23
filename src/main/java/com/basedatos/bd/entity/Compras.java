package com.basedatos.bd.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPRAS")
public class Compras implements Serializable{
	
	private static final long serialVersionUID = -9180820175066462968L;

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "FECHA")
	private Date fecha;
	
	//@Column(name = "IDCLIENTE")
	//private int idCliente;
	
	@ManyToOne
	@JoinColumn(name = "IDCLIENTE")
	private Cliente cliente;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	
	
	
	

}
