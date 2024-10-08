package com.pillpopback.pillpopbackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pillpopback.pillpopbackend.entity.ListaTomas;
import com.pillpopback.pillpopbackend.service.ListaTomasService;

@RestController
@RequestMapping("/listaTomas")
public class ListaTomasController {

	@Autowired
	private ListaTomasService service;

	@PostMapping
	public ResponseEntity<ListaTomas> create(@Validated @RequestBody ListaTomas listaTomas) {
		ListaTomas listaTomasSave = service.create(listaTomas);
		return new ResponseEntity<ListaTomas>(listaTomasSave, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<ListaTomas>> read() {
		List<ListaTomas> list = service.read();
		return new ResponseEntity<List<ListaTomas>>(list, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<ListaTomas> update(@Validated @RequestBody ListaTomas listaTomas) {
		ListaTomas listaTomasSave = service.update(listaTomas);
		return new ResponseEntity<ListaTomas>(listaTomasSave, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
