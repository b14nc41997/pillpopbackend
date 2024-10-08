package com.pillpopback.pillpopbackend.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario_Paciente")
@Data
public class UsuarioPaciente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "doctor_id")
	private Integer doctor_id;
	@Column(name = "nombreCompleto")
	private String nombreCompleto;
	@Column(name = "sexo_id")
	private Integer sexo_id;
	@Column(name = "edad")
	private Integer edad;
	@Column(name = "dni")
	private Integer dni;
	@Column(name = "correoElectronico")
	private String correoElectronico;
	@Column(name = "contrasena")
	private String contrasena;
}