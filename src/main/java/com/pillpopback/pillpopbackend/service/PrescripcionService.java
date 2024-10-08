package com.pillpopback.pillpopbackend.service;
import java.util.List;
import com.pillpopback.pillpopbackend.entity.Prescripcion;

public interface PrescripcionService {
	Prescripcion create(Prescripcion prescripcion);
    List<Prescripcion> read();
    Prescripcion update(Prescripcion prescripcion);
	void delete(Integer id);
}