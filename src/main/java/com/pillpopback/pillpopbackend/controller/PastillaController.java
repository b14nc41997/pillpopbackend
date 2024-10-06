package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.PastillaDTO;
import com.pillpopback.pillpopbackend.service.PastillaService;

@RestController
@RequestMapping("/pastilla")
public class PastillaController {

    @Autowired
    private PastillaService pastillaService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody PastillaDTO pastillaDTO) {
        pastillaService.guardarPastilla(pastillaDTO);
    }

    @GetMapping("/listar")
    public List<PastillaDTO> listar() {
        return pastillaService.listarPastillaes();
    }
}
