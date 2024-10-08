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
@Table(name = "lista_Tomas")
@Data
public class ListaTomas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "prescripcion_id")
	private String prescripcion_id;
	@Column(name = "pastilla_id")
	private Integer pastilla_id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_toma")
	private DateTimeFormat fecha_toma;
	@Column(name = "dosis")
	private Integer dosis;
	@Column(name = "toma")
	private Boolean toma;
	
}