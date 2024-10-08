package com.pillpopback.pillpopbackend.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillpopback.pillpopbackend.entity.ListaTomas;
import com.pillpopback.pillpopbackend.repository.ListaTomasRepository;
import com.pillpopback.pillpopbackend.service.ListaTomasService;

@Service
public class ListaTomasServiceImpl implements ListaTomasService {

	@Autowired
	private ListaTomasRepository repository;

	@Override
	public ListaTomas create(ListaTomas listaTomas) {
		return repository.save(listaTomas);
	}

	@Override
	public List<ListaTomas> read() {
		return repository.findAll();
	}

	@Override
	public ListaTomas update(ListaTomas listaTomas) {
		return repository.save(listaTomas);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}