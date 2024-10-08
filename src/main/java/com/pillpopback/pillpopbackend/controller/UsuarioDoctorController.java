package com.pillpopback.pillpopbackend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pillpopback.pillpopbackend.entity.UsuarioDoctor;
import com.pillpopback.pillpopbackend.service.UsuarioDoctorService;

@RestController
@RequestMapping("/usuarioDoctor")
public class UsuarioDoctorController {

	@Autowired
	private UsuarioDoctorService service;

	@PostMapping
	public ResponseEntity<UsuarioDoctor> create(@Validated @RequestBody UsuarioDoctor usuarioDoctor) {
		UsuarioDoctor usuarioDoctorSave = service.create(usuarioDoctor);
		return new ResponseEntity<UsuarioDoctor>(usuarioDoctorSave, HttpStatus.CREATED);
	}

}
