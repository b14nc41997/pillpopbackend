package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.Pastilla;
import com.pillpopback.pillpopbackend.repository.PastillaRepository;
import com.pillpopback.pillpopbackend.service.PastillaService;

@Service
public class PastillaServiceImpl implements PastillaService {

	@Autowired
	private PastillaRepository repository;

	@Override
	public Pastilla create(Pastilla pastilla) {
		return repository.save(pastilla);
	}

	@Override
	public List<Pastilla> read() {
		return repository.findAll();
	}

	@Override
	public Pastilla update(Pastilla pastilla) {
		return repository.save(pastilla);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}