package com.auroracode.appempleos.repository;

import com.auroracode.appempleos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}
