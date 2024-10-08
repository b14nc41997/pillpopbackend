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
import com.pillpopback.pillpopbackend.entity.UsuarioPaciente;
import com.pillpopback.pillpopbackend.service.UsuarioPacienteService;

@RestController
@RequestMapping("/usuarioPaciente")
public class UsuarioPacienteController {

	@Autowired
	private UsuarioPacienteService service;

	@PostMapping
	public ResponseEntity<UsuarioPaciente> create(@Validated @RequestBody UsuarioPaciente usuarioPaciente) {
		UsuarioPaciente usuarioPacienteSave = service.create(usuarioPaciente);
		return new ResponseEntity<UsuarioPaciente>(usuarioPacienteSave, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<UsuarioPaciente>> read() {
		List<UsuarioPaciente> list = service.read();
		return new ResponseEntity<List<UsuarioPaciente>>(list, HttpStatus.OK);
	}
    
	@PutMapping
	public ResponseEntity<UsuarioPaciente> update(@Validated @RequestBody UsuarioPaciente usuarioPaciente) {
		UsuarioPaciente usuarioPacienteSave = service.update(usuarioPaciente);
		return new ResponseEntity<UsuarioPaciente>(usuarioPacienteSave, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
