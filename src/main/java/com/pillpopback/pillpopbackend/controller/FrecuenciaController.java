package com.pillpopback.pillpopbackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pillpopback.pillpopbackend.entity.Frecuencia;
import com.pillpopback.pillpopbackend.service.FrecuenciaService;

@RestController
@RequestMapping("/frecuencia")
public class FrecuenciaController{

	@Autowired
	private FrecuenciaService service;

    @GetMapping
	public ResponseEntity<List<Frecuencia>> read() {
		List<Frecuencia> list = service.read();
		return new ResponseEntity<List<Frecuencia>>(list, HttpStatus.OK);
	}

}
