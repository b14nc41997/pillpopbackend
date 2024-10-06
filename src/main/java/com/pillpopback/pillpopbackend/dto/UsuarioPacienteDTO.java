package com.pillpopback.pillpopbackend.dto;

public class UsuarioPacienteDTO{
    
	private Integer id;
	private Integer doctorId;
	private String nombreCompleto;
	private Integer sexoId;
	private Integer edad;
	private Integer dni;
	private String correoElectronico;
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