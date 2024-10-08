package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.Frecuencia;
import com.pillpopback.pillpopbackend.repository.FrecuenciaRepository;
import com.pillpopback.pillpopbackend.service.FrecuenciaService;

@Service
public class FrecuenciaServiceImpl implements FrecuenciaService {

	@Autowired
	private FrecuenciaRepository repository;

	@Override
	public List<Frecuencia> read() {
		return repository.findAll();
	}

}