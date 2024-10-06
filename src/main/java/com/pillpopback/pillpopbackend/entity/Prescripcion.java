package com.pillpopback.pillpopbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Prescripcion {
    @Id
	private Integer id;
	@Column
	private Integer pacienteId;
	@Column
	private String diagnostico;
	@Column
	private DateTimeFormat fecha;

	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public Integer getPacienteId() {return pacienteId;}
	public void setPacienteId(Integer pacienteId) {this.pacienteId = pacienteId;}

	public String getDiagnostico() {return diagnostico;}
	public void setDiagnostico(String diagnostico) {this.diagnostico = diagnostico;}

	public DateTimeFormat getFecha() {return fecha;}
	public void setFecha(DateTimeFormat fecha) {this.fecha = fecha;}
	
}