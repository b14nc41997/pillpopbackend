package com.pillpopback.pillpopbackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pillpopback.pillpopbackend.entity.Especialidad;
import com.pillpopback.pillpopbackend.service.EspecialidadService;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController{

	@Autowired
	private EspecialidadService service;

    @GetMapping
	public ResponseEntity<List<Especialidad>> read() {
		List<Especialidad> list = service.read();
		return new ResponseEntity<List<Especialidad>>(list, HttpStatus.OK);
	}

}
