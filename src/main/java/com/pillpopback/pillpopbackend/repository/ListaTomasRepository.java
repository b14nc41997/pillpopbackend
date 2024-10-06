package com.pillpopback.pillpopbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pillpopback.pillpopbackend.entity.ListaTomas;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaTomasRepository extends JpaRepository<ListaTomas, Integer> {

}