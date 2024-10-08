package com.pillpopback.pillpopbackend.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "pastillas")
@Data
public class Pastilla {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cantidad")
	private Integer cantidad;
	@Column(name = "dosis")
	private Integer dosis;
	@Column(name = "cantidad_sobrante")
	private Integer cantidad_sobrante;
	@Column(name = "frecuencia_id")
	private Integer frecuencia_id;
	@Column(name = "fecha_inicio")
	private DateTimeFormat fecha_inicio;
	@Column(name = "observaciones")
	private String observaciones;
	@Column(name = "prescripcion_id")
	private Integer prescripcion_id;

}