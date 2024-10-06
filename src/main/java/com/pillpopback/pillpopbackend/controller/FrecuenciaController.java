package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.FrecuenciaDTO;
import com.pillpopback.pillpopbackend.service.FrecuenciaService;

@RestController
@RequestMapping("/frecuencia")
public class FrecuenciaController {

    @Autowired
    private FrecuenciaService frecuenciaService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody FrecuenciaDTO frecuenciaDTO) {
        frecuenciaService.guardarFrecuencia(frecuenciaDTO);
    }

    @GetMapping("/listar")
    public List<FrecuenciaDTO> listar() {
        return frecuenciaService.listarFrecuenciaes();
    }
}
