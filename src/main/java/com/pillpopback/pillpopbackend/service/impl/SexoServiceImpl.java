package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.Sexo;
import com.pillpopback.pillpopbackend.repository.SexoRepository;
import com.pillpopback.pillpopbackend.service.SexoService;

@Service
public class SexoServiceImpl implements SexoService {

	@Autowired
	private SexoRepository repository;

	@Override
	public List<Sexo> read() {
		return repository.findAll();
	}

}