package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.Especialidad;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {

}