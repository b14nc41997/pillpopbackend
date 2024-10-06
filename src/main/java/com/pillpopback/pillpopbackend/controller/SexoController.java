package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.SexoDTO;
import com.pillpopback.pillpopbackend.service.SexoService;

@RestController
@RequestMapping("/sexo")
public class SexoController {

    @Autowired
    private SexoService sexoService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody SexoDTO sexoDTO) {
        sexoService.guardarSexo(sexoDTO);
    }

    @GetMapping("/listar")
    public List<SexoDTO> listar() {
        return sexoService.listarSexoes();
    }
}
