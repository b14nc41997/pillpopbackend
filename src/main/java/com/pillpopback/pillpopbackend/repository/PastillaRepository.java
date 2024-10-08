package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.Pastilla;

public interface PastillaRepository extends JpaRepository<Pastilla, Integer> {

}