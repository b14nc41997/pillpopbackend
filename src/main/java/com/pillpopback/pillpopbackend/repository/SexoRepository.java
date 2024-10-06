package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.Sexo;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Integer> {

}