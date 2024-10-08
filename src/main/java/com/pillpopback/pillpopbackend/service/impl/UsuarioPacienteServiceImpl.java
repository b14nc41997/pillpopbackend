package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.UsuarioPaciente;
import com.pillpopback.pillpopbackend.repository.UsuarioPacienteRepository;
import com.pillpopback.pillpopbackend.service.UsuarioPacienteService;

@Service
public class UsuarioPacienteServiceImpl implements UsuarioPacienteService {

	@Autowired
	private UsuarioPacienteRepository repository;

	@Override
	public UsuarioPaciente create(UsuarioPaciente usuarioPaciente) {
		return repository.save(usuarioPaciente);
	}

	@Override
	public List<UsuarioPaciente> read() {
		return repository.findAll();
	}

	@Override
	public UsuarioPaciente update(UsuarioPaciente usuarioPaciente) {
		return repository.save(usuarioPaciente);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}