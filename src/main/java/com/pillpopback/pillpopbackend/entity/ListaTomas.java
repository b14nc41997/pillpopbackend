package com.pillpopback.pillpopbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ListaTomas {
    @Id
	private Integer id;
	@Column
	private Integer pacienteId;
	@Column
	private Integer pastillaId;
	@Column
	private String nombre;
	@Column
	private DateTimeFormat fechaToma;
	@Column
	private Integer dosis;
	@Column
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