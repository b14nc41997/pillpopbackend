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
import com.pillpopback.pillpopbackend.entity.Prescripcion;
import com.pillpopback.pillpopbackend.service.PrescripcionService;

@RestController
@RequestMapping("/prescripcion")
public class PrescripcionController {

	@Autowired
	private PrescripcionService service;

	@PostMapping
	public ResponseEntity<Prescripcion> create(@Validated @RequestBody Prescripcion prescripcion) {
		Prescripcion prescripcionSave = service.create(prescripcion);
		return new ResponseEntity<Prescripcion>(prescripcionSave, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Prescripcion>> read() {
		List<Prescripcion> list = service.read();
		return new ResponseEntity<List<Prescripcion>>(list, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Prescripcion> update(@Validated @RequestBody Prescripcion prescripcion) {
		Prescripcion prescripcionSave = service.update(prescripcion);
		return new ResponseEntity<Prescripcion>(prescripcionSave, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
