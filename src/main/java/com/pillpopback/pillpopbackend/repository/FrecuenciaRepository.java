package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.Frecuencia;
import org.springframework.stereotype.Repository;

@Repository
public interface FrecuenciaRepository extends JpaRepository<Frecuencia, Integer> {

}