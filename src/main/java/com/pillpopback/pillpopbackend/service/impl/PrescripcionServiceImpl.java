package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.Prescripcion;
import com.pillpopback.pillpopbackend.repository.PrescripcionRepository;
import com.pillpopback.pillpopbackend.service.PrescripcionService;

@Service
public class PrescripcionServiceImpl implements PrescripcionService {

	@Autowired
	private PrescripcionRepository repository;

	@Override
	public Prescripcion create(Prescripcion prescripcion) {
		return repository.save(prescripcion);
	}

	@Override
	public List<Prescripcion> read() {
		return repository.findAll();
	} 

	@Override
	public Prescripcion update(Prescripcion prescripcion) {
		return repository.save(prescripcion);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}