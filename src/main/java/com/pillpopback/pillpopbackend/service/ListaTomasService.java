package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.ListaTomasDTO;
import com.pillpopback.pillpopbackend.entity.ListaTomas;
import com.pillpopback.pillpopbackend.repository.ListaTomasRepository;

@Service
public class ListaTomasService {

    @Autowired
    private ListaTomasRepository listaTomasRepository;

    // Guardar ListaTomas
    public void guardarListaTomas(ListaTomasDTO listaTomasDTO) {
        ListaTomas listaTomas = dtoToEntity(listaTomasDTO);
        listaTomasRepository.save(listaTomas);
    }

    // Listar ListaTomases
    public List<ListaTomasDTO> listarListaTomases() {
        return listaTomasRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private ListaTomas dtoToEntity(ListaTomasDTO dto) {
        ListaTomas listaTomas = new ListaTomas();
        listaTomas.setId(dto.getId());
        listaTomas.setPacienteId(dto.getPacienteId());
        listaTomas.setPastillaId(dto.getPastillaId());
        listaTomas.setNombre(dto.getNombre());
        listaTomas.setFechaToma(dto.getFechaToma());
        listaTomas.setDosis(dto.getDosis());
        listaTomas.setToma(dto.getToma());
        return listaTomas;
    }

    // Conversión de Entidad a DTO
    private ListaTomasDTO entityToDTO(ListaTomas listaTomas) {
        ListaTomasDTO dto = new ListaTomasDTO();
        dto.setId(listaTomas.getId());
        dto.setPacienteId(listaTomas.getPacienteId());
        dto.setPastillaId(listaTomas.getPastillaId());
        dto.setNombre(listaTomas.getNombre());
        dto.setFechaToma(listaTomas.getFechaToma());
        dto.setDosis(listaTomas.getDosis());
        dto.setToma(listaTomas.getToma());
        return dto;
    }
}
