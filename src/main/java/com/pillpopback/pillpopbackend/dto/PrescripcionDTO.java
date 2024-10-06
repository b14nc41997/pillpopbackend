package com.pillpopback.pillpopbackend.dto;

import org.springframework.format.annotation.DateTimeFormat;


public class PrescripcionDTO{
    
	private Integer id;
	private Integer pacienteId;
	private String diagnostico;
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