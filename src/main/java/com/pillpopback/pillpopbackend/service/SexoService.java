package com.pillpopback.pillpopbackend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pillpopback.pillpopbackend.dto.SexoDTO;
import com.pillpopback.pillpopbackend.entity.Sexo;
import com.pillpopback.pillpopbackend.repository.SexoRepository;

@Service
public class SexoService {

    @Autowired
    private SexoRepository sexoRepository;

    // Guardar Sexo
    public void guardarSexo(SexoDTO sexoDTO) {
        Sexo sexo = dtoToEntity(sexoDTO);
        sexoRepository.save(sexo);
    }

    // Listar Sexoes
    public List<SexoDTO> listarSexoes() {
        return sexoRepository.findAll()
            .stream()
            .map(this::entityToDTO)
            .collect(Collectors.toList());
    }

    // Conversión de DTO a Entidad
    private Sexo dtoToEntity(SexoDTO dto) {
        Sexo sexo = new Sexo();
        sexo.setId(dto.getId());
        sexo.setNombre(dto.getNombre());
        return sexo;
    }

    // Conversión de Entidad a DTO
    private SexoDTO entityToDTO(Sexo sexo) {
        SexoDTO dto = new SexoDTO();
        dto.setId(sexo.getId());
        dto.setNombre(sexo.getNombre());
        return dto;
    }
}
