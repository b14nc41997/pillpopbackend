package com.pillpopback.pillpopbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Frecuencia {
    @Id
	private Integer id;
	@Column
	private String tipo;	
	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo = tipo;}
	
}