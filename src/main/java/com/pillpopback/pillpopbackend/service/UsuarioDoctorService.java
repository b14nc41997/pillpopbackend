package com.pillpopback.pillpopbackend.service;
import java.util.List;
import com.pillpopback.pillpopbackend.entity.UsuarioDoctor;

public interface UsuarioDoctorService {
	UsuarioDoctor create(UsuarioDoctor usuarioDoctor);
    List<UsuarioDoctor> read();
    UsuarioDoctor update(UsuarioDoctor usuarioDoctor);
	void delete(Integer id);
}