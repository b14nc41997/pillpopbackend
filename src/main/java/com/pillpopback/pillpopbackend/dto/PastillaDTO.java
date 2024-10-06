package com.pillpopback.pillpopbackend.dto;

import org.springframework.format.annotation.DateTimeFormat;


public class PastillaDTO{
    
	private Integer id;
	private String nombre;	
	private Integer cantidad;
	private Integer dosis;
	private Integer cantidadSobrante;
	private Integer frecuenciaId;
	private DateTimeFormat fechaInicio;
	private String observaciones;
	private Integer prescripcionId;

	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public Integer getCantidad() {return cantidad;}
	public void setCantidadd(Integer cantidad) {this.cantidad = cantidad;}

	public Integer getDosis() {return dosis;}
	public void setDosis(Integer dosis) {this.dosis = dosis;}

	public Integer getCantidadSobrante() {return cantidadSobrante;}
	public void setCantidadSobrante(Integer cantidadSobrante) {this.cantidadSobrante = cantidadSobrante;}

	public Integer getFrecuenciaId() {return frecuenciaId;}
	public void setFrecuenciaId(Integer frecuenciaId) {this.frecuenciaId = frecuenciaId;}

    public DateTimeFormat getFechaInicio() {return fechaInicio;}
	public void setFechaInicio(DateTimeFormat fechaInicio) {this.fechaInicio = fechaInicio;}

	public String getObservaciones() {return observaciones;}
	public void setObservaciones(String observaciones) {this.observaciones = observaciones;}

	public Integer getPrescripcionId() {return prescripcionId;}
	public void setPrescripcionId(Integer prescripcionId) {this.prescripcionId = prescripcionId;}
	
}