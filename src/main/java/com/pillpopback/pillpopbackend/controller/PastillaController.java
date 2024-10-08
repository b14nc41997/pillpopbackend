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
import com.pillpopback.pillpopbackend.entity.Pastilla;
import com.pillpopback.pillpopbackend.service.PastillaService;

@RestController
@RequestMapping("/pastilla")
public class PastillaController {

	@Autowired
	private PastillaService service;

	@PostMapping
	public ResponseEntity<Pastilla> create(@Validated @RequestBody Pastilla pastilla) {
		Pastilla pastillaSave = service.create(pastilla);
		return new ResponseEntity<Pastilla>(pastillaSave, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Pastilla>> read() {
		List<Pastilla> list = service.read();
		return new ResponseEntity<List<Pastilla>>(list, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Pastilla> update(@Validated @RequestBody Pastilla pastilla) {
		Pastilla pastillaSave = service.update(pastilla);
		return new ResponseEntity<Pastilla>(pastillaSave, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
