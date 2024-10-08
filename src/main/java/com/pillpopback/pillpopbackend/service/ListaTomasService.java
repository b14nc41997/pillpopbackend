package com.pillpopback.pillpopbackend.service;
import java.util.List;
import com.pillpopback.pillpopbackend.entity.ListaTomas;

public interface ListaTomasService {
	ListaTomas create(ListaTomas listaTomas);
    List<ListaTomas> read();
    ListaTomas update(ListaTomas listaTomas);
	void delete(Integer id);
}