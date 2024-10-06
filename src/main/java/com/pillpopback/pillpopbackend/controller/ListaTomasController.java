package com.pillpopback.pillpopbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillpopback.pillpopbackend.dto.ListaTomasDTO;
import com.pillpopback.pillpopbackend.service.ListaTomasService;

@RestController
@RequestMapping("/listaTomas")
public class ListaTomasController {

    @Autowired
    private ListaTomasService listaTomasService;

    @PostMapping("/guardar")
    public void guardar(@RequestBody ListaTomasDTO listaTomasDTO) {
        listaTomasService.guardarListaTomas(listaTomasDTO);
    }

    @GetMapping("/listar")
    public List<ListaTomasDTO> listar() {
        return listaTomasService.listarListaTomases();
    }
}
