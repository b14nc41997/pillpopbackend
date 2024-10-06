package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.UsuarioPaciente;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPacienteRepository extends JpaRepository<UsuarioPaciente, Integer> {

}