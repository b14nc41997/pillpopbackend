package com.pillpopback.pillpopbackend.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsuarioPaciente {
    @Id
	private Integer id;
	@Column
	private Integer doctorId;
	@Column
	private String nombreCompleto;
	@Column
	private Integer sexoId;
	@Column
	private Integer edad;
	@Column
	private Integer dni;
	@Column
	private String correoElectronico;
    @Column
	private String contrasena;

	
//	Getters and Setters
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}

	public Integer getDoctorId() {return doctorId;}
	public void setDoctorId(Integer doctorId) {this.doctorId = doctorId;}

	public String getNombreCompleto() {return nombreCompleto;}
	public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}

	public Integer getSexoId() {return sexoId;}
	public void setSexoId(Integer sexoId) {this.sexoId = sexoId;}

	public Integer getEdad() {return edad;}
	public void setEdad(Integer edad) {this.edad = edad;}

    public Integer getDni() {return dni;}
	public void setDni(Integer dni) {this.dni = dni;}

	public String getCorreoElectronico() {return correoElectronico;}
	public void setCorreoElectronico(String correoElectronico) {this.correoElectronico = correoElectronico;}

	public String getContrasena() {return contrasena;}
	public void setContrasena(String contrasena) {this.contrasena = contrasena;}
	
}