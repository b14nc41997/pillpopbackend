package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.Especialidad;
import com.pillpopback.pillpopbackend.repository.EspecialidadRepository;
import com.pillpopback.pillpopbackend.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository repository;

	@Override
	public List<Especialidad> read() {
		return repository.findAll();
	}

}