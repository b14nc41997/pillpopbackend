package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.UsuarioDoctor;
import com.pillpopback.pillpopbackend.repository.UsuarioDoctorRepository;
import com.pillpopback.pillpopbackend.service.UsuarioDoctorService;

@Service
public class UsuarioDoctorServiceImpl implements UsuarioDoctorService {

	@Autowired
	private UsuarioDoctorRepository repository;

	@Override
	public UsuarioDoctor create(UsuarioDoctor usuarioDoctor) {
		return repository.save(usuarioDoctor);
	}

	@Override
	public List<UsuarioDoctor> read() {
		return repository.findAll();
	}

	@Override
	public UsuarioDoctor update(UsuarioDoctor usuarioDoctor) {
		return repository.save(usuarioDoctor);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}