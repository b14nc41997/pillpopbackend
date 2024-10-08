package com.pillpopback.pillpopbackend.service;
import java.util.List;
import com.pillpopback.pillpopbackend.entity.Pastilla;

public interface PastillaService {
	Pastilla create(Pastilla pastilla);
    List<Pastilla> read();
    Pastilla update(Pastilla pastilla);
	void delete(Integer id);
}