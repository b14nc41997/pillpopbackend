package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.PrescripcionDTO;
import com.pillpopback.pillpopbackend.service.PrescripcionService;

@RestController
@RequestMapping("/prescripcion")
public class PrescripcionController {

    @Autowired
    private PrescripcionService prescripcionService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody PrescripcionDTO prescripcionDTO) {
        prescripcionService.guardarPrescripcion(prescripcionDTO);
    }

    @GetMapping("/listar")
    public List<PrescripcionDTO> listar() {
        return prescripcionService.listarPrescripciones();
    }
}
