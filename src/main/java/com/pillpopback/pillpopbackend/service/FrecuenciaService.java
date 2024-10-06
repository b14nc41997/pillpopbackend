package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.FrecuenciaDTO;
import com.pillpopback.pillpopbackend.entity.Frecuencia;
import com.pillpopback.pillpopbackend.repository.FrecuenciaRepository;

@Service
public class FrecuenciaService {

    @Autowired
    private FrecuenciaRepository frecuenciaRepository;

    // Guardar Frecuencia
    public void guardarFrecuencia(FrecuenciaDTO frecuenciaDTO) {
        Frecuencia frecuencia = dtoToEntity(frecuenciaDTO);
        frecuenciaRepository.save(frecuencia);
    }

    // Listar Frecuenciaes
    public List<FrecuenciaDTO> listarFrecuenciaes() {
        return frecuenciaRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private Frecuencia dtoToEntity(FrecuenciaDTO dto) {
        Frecuencia frecuencia = new Frecuencia();
        frecuencia.setId(dto.getId());
        frecuencia.setTipo(dto.getTipo());
        return frecuencia;
    }

    // Conversión de Entidad a DTO
    private FrecuenciaDTO entityToDTO(Frecuencia frecuencia) {
        FrecuenciaDTO dto = new FrecuenciaDTO();
        dto.setId(frecuencia.getId());
        dto.setTipo(frecuencia.getTipo());
        return dto;
    }
}
