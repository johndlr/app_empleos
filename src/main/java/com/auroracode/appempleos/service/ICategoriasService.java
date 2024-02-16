package com.auroracode.appempleos.service;

import java.util.List;

import com.auroracode.appempleos.model.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface ICategoriasService {
	void guardar(Categoria categoria);
	void eliminar(Integer idCategoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
	Page<Categoria> buscarTodas(Pageable page);
}
