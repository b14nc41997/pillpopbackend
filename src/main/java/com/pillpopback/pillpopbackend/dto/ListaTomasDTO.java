package com.pillpopback.pillpopbackend.dto;

import org.springframework.format.annotation.DateTimeFormat;


public class ListaTomasDTO{
    
	private Integer id;
	private Integer pacienteId;
	private Integer pastillaId;
	private String nombre;
	private DateTimeFormat fechaToma;
	private Integer dosis;
	private Boolean toma;

	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public Integer getPacienteId() {return pacienteId;}
	public void setPacienteId(Integer pacienteId) {this.pacienteId = pacienteId;}
	
	public Integer getPastillaId() {return pastillaId;}
	public void setPastillaId(Integer pastillaId) {this.pastillaId = pastillaId;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public DateTimeFormat getFechaToma() {return fechaToma;}
	public void setFechaToma(DateTimeFormat fechaToma) {this.fechaToma = fechaToma;}

	public Integer getDosis() {return dosis;}
	public void setDosis(Integer dosis) {this.dosis = dosis;}

    public Boolean getToma() {return toma;}
	public void setToma(Boolean toma) {this.toma = toma;}
	
}