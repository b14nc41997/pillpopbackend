package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.UsuarioDoctor;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDoctorRepository extends JpaRepository<UsuarioDoctor, Integer> {

}