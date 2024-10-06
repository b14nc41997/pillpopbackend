package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.EspecialidadDTO;
import com.pillpopback.pillpopbackend.entity.Especialidad;
import com.pillpopback.pillpopbackend.repository.EspecialidadRepository;

@Service
public class EspecialidadService {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    // Guardar Especialidad
    public void guardarEspecialidad(EspecialidadDTO especialidadDTO) {
        Especialidad especialidad = dtoToEntity(especialidadDTO);
        especialidadRepository.save(especialidad);
    }

    // Listar Especialidades
    public List<EspecialidadDTO> listarEspecialidades() {
        return especialidadRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private Especialidad dtoToEntity(EspecialidadDTO dto) {
        Especialidad especialidad = new Especialidad();
        especialidad.setId(dto.getId());
        especialidad.setNombre(dto.getNombre());
        return especialidad;
    }

    // Conversión de Entidad a DTO
    private EspecialidadDTO entityToDTO(Especialidad especialidad) {
        EspecialidadDTO dto = new EspecialidadDTO();
        dto.setId(especialidad.getId());
        dto.setNombre(especialidad.getNombre());
        return dto;
    }
}
