package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.UsuarioDoctorDTO;
import com.pillpopback.pillpopbackend.entity.UsuarioDoctor;
import com.pillpopback.pillpopbackend.repository.UsuarioDoctorRepository;

@Service
public class UsuarioDoctorService {

    @Autowired
    private UsuarioDoctorRepository usuarioDoctorRepository;

    // Guardar UsuarioDoctor
    public void guardarUsuarioDoctor(UsuarioDoctorDTO usuarioDoctorDTO) {
        UsuarioDoctor usuarioDoctor = dtoToEntity(usuarioDoctorDTO);
        usuarioDoctorRepository.save(usuarioDoctor);
    }

    // Listar UsuarioDoctores
    public List<UsuarioDoctorDTO> listarUsuarioDoctores() {
        return usuarioDoctorRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private UsuarioDoctor dtoToEntity(UsuarioDoctorDTO dto) {
        UsuarioDoctor usuarioDoctor = new UsuarioDoctor();
        usuarioDoctor.setId(dto.getId());
        usuarioDoctor.setNombreCompleto(dto.getNombreCompleto());
        usuarioDoctor.setSexoId(dto.getSexoId());
        usuarioDoctor.setEspecialidadId(dto.getEspecialidadId());
        usuarioDoctor.setDni(dto.getDni());
        usuarioDoctor.setCorreoElectronico(dto.getCorreoElectronico());
        usuarioDoctor.setContrasena(dto.getContrasena());
        return usuarioDoctor;
    }

    // Conversión de Entidad a DTO
    private UsuarioDoctorDTO entityToDTO(UsuarioDoctor usuarioDoctor) {
        UsuarioDoctorDTO dto = new UsuarioDoctorDTO();
        dto.setId(usuarioDoctor.getId());
        dto.setNombreCompleto(usuarioDoctor.getNombreCompleto());
        dto.setSexoId(usuarioDoctor.getSexoId());
        dto.setEspecialidadId(usuarioDoctor.getEspecialidadId());
        dto.setDni(usuarioDoctor.getDni());
        dto.setCorreoElectronico(usuarioDoctor.getCorreoElectronico());
        dto.setContrasena(usuarioDoctor.getContrasena());
        return dto;
    }
}
