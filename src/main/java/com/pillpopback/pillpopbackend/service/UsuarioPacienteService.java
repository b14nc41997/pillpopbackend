package com.pillpopback.pillpopbackend.service;
import java.util.List;
import com.pillpopback.pillpopbackend.entity.UsuarioPaciente;

public interface UsuarioPacienteService {
	UsuarioPaciente create(UsuarioPaciente usuarioPaciente);
    List<UsuarioPaciente> read();
    UsuarioPaciente update(UsuarioPaciente usuarioPaciente);
	void delete(Integer id);
}