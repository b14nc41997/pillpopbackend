package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.UsuarioPacienteDTO;
import com.pillpopback.pillpopbackend.entity.UsuarioPaciente;
import com.pillpopback.pillpopbackend.repository.UsuarioPacienteRepository;

@Service
public class UsuarioPacienteService {

    @Autowired
    private UsuarioPacienteRepository usuarioPacienteRepository;

    // Guardar UsuarioPaciente
    public void guardarUsuarioPaciente(UsuarioPacienteDTO usuarioPacienteDTO) {
        UsuarioPaciente usuarioPaciente = dtoToEntity(usuarioPacienteDTO);
        usuarioPacienteRepository.save(usuarioPaciente);
    }

    // Listar UsuarioPacientees
    public List<UsuarioPacienteDTO> listarUsuarioPacientees() {
        return usuarioPacienteRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private UsuarioPaciente dtoToEntity(UsuarioPacienteDTO dto) {
        UsuarioPaciente usuarioPaciente = new UsuarioPaciente();
        usuarioPaciente.setId(dto.getId());
        usuarioPaciente.setDoctorId(dto.getDoctorId());
        usuarioPaciente.setNombreCompleto(dto.getNombreCompleto());
        usuarioPaciente.setSexoId(dto.getSexoId());
        usuarioPaciente.setEdad(dto.getEdad());
        usuarioPaciente.setDni(dto.getDni());
        usuarioPaciente.setCorreoElectronico(dto.getCorreoElectronico());
        usuarioPaciente.setContrasena(dto.getContrasena());
        return usuarioPaciente;
    }

    // Conversión de Entidad a DTO
    private UsuarioPacienteDTO entityToDTO(UsuarioPaciente usuarioPaciente) {
        UsuarioPacienteDTO dto = new UsuarioPacienteDTO();
        dto.setId(usuarioPaciente.getId());
        dto.setDoctorId(usuarioPaciente.getDoctorId());
        dto.setNombreCompleto(usuarioPaciente.getNombreCompleto());
        dto.setSexoId(usuarioPaciente.getSexoId());
        dto.setEdad(usuarioPaciente.getEdad());
        dto.setDni(usuarioPaciente.getDni());
        dto.setCorreoElectronico(usuarioPaciente.getCorreoElectronico());
        dto.setContrasena(usuarioPaciente.getContrasena());
        return dto;
    }
}
