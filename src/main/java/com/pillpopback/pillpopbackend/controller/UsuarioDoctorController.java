package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.UsuarioDoctorDTO;
import com.pillpopback.pillpopbackend.service.UsuarioDoctorService;

@RestController
@RequestMapping("/usuarioDoctor")
public class UsuarioDoctorController {

    @Autowired
    private UsuarioDoctorService usuarioDoctorService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody UsuarioDoctorDTO usuarioDoctorDTO) {
        usuarioDoctorService.guardarUsuarioDoctor(usuarioDoctorDTO);
    }

    @GetMapping("/listar")
    public List<UsuarioDoctorDTO> listar() {
        return usuarioDoctorService.listarUsuarioDoctores();
    }
}
