package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.PrescripcionDTO;
import com.pillpopback.pillpopbackend.entity.Prescripcion;
import com.pillpopback.pillpopbackend.repository.PrescripcionRepository;

@Service
public class PrescripcionService {

    @Autowired
    private PrescripcionRepository prescripcionRepository;

    // Guardar Prescripcion
    public void guardarPrescripcion(PrescripcionDTO prescripcionDTO) {
        Prescripcion prescripcion = dtoToEntity(prescripcionDTO);
        prescripcionRepository.save(prescripcion);
    }

    // Listar Prescripciones
    public List<PrescripcionDTO> listarPrescripciones() {
        return prescripcionRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private Prescripcion dtoToEntity(PrescripcionDTO dto) {
        Prescripcion prescripcion = new Prescripcion();
        prescripcion.setId(dto.getId());
        prescripcion.setPacienteId(dto.getPacienteId());
        prescripcion.setDiagnostico(dto.getDiagnostico());
        prescripcion.setFecha(dto.getFecha());
        return prescripcion;
    }

    // Conversión de Entidad a DTO
    private PrescripcionDTO entityToDTO(Prescripcion prescripcion) {
        PrescripcionDTO dto = new PrescripcionDTO();
        dto.setId(prescripcion.getId());
        dto.setPacienteId(prescripcion.getPacienteId());
        dto.setDiagnostico(prescripcion.getDiagnostico());
        dto.setFecha(prescripcion.getFecha());
        return dto;
    }
}
