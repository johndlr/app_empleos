package com.auroracode.appempleos.repository;

import com.auroracode.appempleos.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
