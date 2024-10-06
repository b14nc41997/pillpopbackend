package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.EspecialidadDTO;
import com.pillpopback.pillpopbackend.service.EspecialidadService;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody EspecialidadDTO especialidadDTO) {
        especialidadService.guardarEspecialidad(especialidadDTO);
    }

    @GetMapping("/listar")
    public List<EspecialidadDTO> listar() {
        return especialidadService.listarEspecialidades();
    }
}
