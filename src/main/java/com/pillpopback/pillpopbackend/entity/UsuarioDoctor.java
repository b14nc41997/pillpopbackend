package com.pillpopback.pillpopbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsuarioDoctor {
    @Id
	private Integer id;
	@Column
	private String nombreCompleto;
	@Column
	private Integer sexoId;
	@Column
	private Integer especialidadId;
	@Column
	private Integer dni;
	@Column
	private String correoElectronico;
    @Column
	private String contrasena;

	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public String getNombreCompleto() {return nombreCompleto;}
	public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}

	public Integer getSexoId() {return sexoId;}
	public void setSexoId(Integer sexoId) {this.sexoId = sexoId;}

	public Integer getEspecialidadId() {return especialidadId;}
	public void setEspecialidadId(Integer especialidadId) {this.especialidadId = especialidadId;}

    public Integer getDni() {return dni;}
	public void setDni(Integer dni) {this.dni = dni;}

	public String getCorreoElectronico() {return correoElectronico;}
	public void setCorreoElectronico(String correoElectronico) {this.correoElectronico = correoElectronico;}

	public String getContrasena() {return contrasena;}
	public void setContrasena(String contrasena) {this.contrasena = contrasena;}
	
}