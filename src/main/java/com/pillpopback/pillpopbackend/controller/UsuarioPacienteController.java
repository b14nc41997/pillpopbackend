package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.UsuarioPacienteDTO;
import com.pillpopback.pillpopbackend.service.UsuarioPacienteService;

@RestController
@RequestMapping("/usuarioPaciente")
public class UsuarioPacienteController{

    @Autowired
    private UsuarioPacienteService usuarioPacienteService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody UsuarioPacienteDTO usuarioPacienteDTO) {
        usuarioPacienteService.guardarUsuarioPaciente(usuarioPacienteDTO);
    }

    @GetMapping("/listar")
    public List<UsuarioPacienteDTO> listar() {
        return usuarioPacienteService.listarUsuarioPacientees();
    }
}
