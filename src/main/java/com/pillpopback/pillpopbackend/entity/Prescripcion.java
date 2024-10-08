package com.pillpopback.pillpopbackend.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "prescripciones")
@Data
public class Prescripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "paciente_id")
	private Integer paciente_id;
	@Column(name = "diagnostico")
	private String diagnostico;
	@Column(name = "fecha")
	private DateTimeFormat fecha;
}