package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.Prescripcion;

public interface PrescripcionRepository extends JpaRepository<Prescripcion, Integer> {

}