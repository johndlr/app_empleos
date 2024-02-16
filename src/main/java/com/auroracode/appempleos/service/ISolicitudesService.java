package com.auroracode.appempleos.service;

import java.util.List;

import com.auroracode.appempleos.model.Solicitud;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface ISolicitudesService {
	void guardar(Solicitud solicitud);
	void eliminar(Integer idSolicitud);
	List<Solicitud> buscarTodas();
	Solicitud buscarPorId(Integer idSolicitud);
	Page<Solicitud> buscarTodas(Pageable page);
}
