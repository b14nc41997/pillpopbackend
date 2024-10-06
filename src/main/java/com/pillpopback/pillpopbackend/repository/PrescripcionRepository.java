package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.Prescripcion;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescripcionRepository extends JpaRepository<Prescripcion, Integer> {

}