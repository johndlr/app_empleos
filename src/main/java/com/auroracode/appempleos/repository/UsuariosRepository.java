package com.auroracode.appempleos.repository;

import java.util.List;

import com.auroracode.appempleos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	// Buscar usuario por username
	Usuario findByUsername(String username);
	List<Usuario> findByFechaRegistroNotNull();
	
	@Modifying
    @Query("UPDATE Usuario u SET u.estatus=0 WHERE u.id = :paramIdUsuario")
    int lock(@Param("paramIdUsuario") int idUsuario);
	
	@Modifying
    @Query("UPDATE Usuario u SET u.estatus=1 WHERE u.id = :paramIdUsuario")
    int unlock(@Param("paramIdUsuario") int idUsuario);
	
}
