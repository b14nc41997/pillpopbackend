package com.pillpopback.pillpopbackend.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pillpopback.pillpopbackend.entity.Sexo;
import com.pillpopback.pillpopbackend.service.SexoService;

@RestController
@RequestMapping("/sexo")
public class SexoController{

	@Autowired
	private SexoService service;

    @GetMapping
	public ResponseEntity<List<Sexo>> read() {
		List<Sexo> list = service.read();
		return new ResponseEntity<List<Sexo>>(list, HttpStatus.OK);
	}

}
