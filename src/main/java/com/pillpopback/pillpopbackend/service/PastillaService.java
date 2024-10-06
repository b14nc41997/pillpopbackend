package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.PastillaDTO;
import com.pillpopback.pillpopbackend.entity.Pastilla;
import com.pillpopback.pillpopbackend.repository.PastillaRepository;

@Service
public class PastillaService {

    @Autowired
    private PastillaRepository pastillaRepository;

    // Guardar Pastilla
    public void guardarPastilla(PastillaDTO pastillaDTO) {
        Pastilla pastilla = dtoToEntity(pastillaDTO);
        pastillaRepository.save(pastilla);
    }

    // Listar Pastillaes
    public List<PastillaDTO> listarPastillaes() {
        return pastillaRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private Pastilla dtoToEntity(PastillaDTO dto) {
        Pastilla pastilla = new Pastilla();
        pastilla.setId(dto.getId());
        pastilla.setNombre(dto.getNombre());
        pastilla.setCantidadd(dto.getCantidad());
        pastilla.setDosis(dto.getDosis());
        pastilla.setCantidadSobrante(dto.getCantidadSobrante());
        pastilla.setFrecuenciaId(dto.getFrecuenciaId());
        pastilla.setFechaInicio(dto.getFechaInicio());
        pastilla.setObservaciones(dto.getObservaciones());
        pastilla.setPrescripcionId(dto.getPrescripcionId());
        return pastilla;
    }

    // Conversión de Entidad a DTO
    private PastillaDTO entityToDTO(Pastilla pastilla) {
        PastillaDTO dto = new PastillaDTO();
        dto.setId(pastilla.getId());
        dto.setNombre(pastilla.getNombre());
        dto.setCantidadd(pastilla.getCantidad());
        dto.setDosis(pastilla.getDosis());
        dto.setCantidadSobrante(pastilla.getCantidadSobrante());
        dto.setFrecuenciaId(pastilla.getFrecuenciaId());
        dto.setFechaInicio(pastilla.getFechaInicio());
        dto.setObservaciones(pastilla.getObservaciones());
        dto.setPrescripcionId(pastilla.getPrescripcionId());
        return dto;
    }
}
