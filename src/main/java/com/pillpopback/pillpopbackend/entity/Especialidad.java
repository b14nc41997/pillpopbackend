package com.pillpopback.pillpopbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Especialidad {
    @Id
	private Integer id;
	@Column
	private String nombre;	
	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
}