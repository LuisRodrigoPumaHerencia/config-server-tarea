package com.bootcamp.consulta_medica.controllers;

import com.bootcamp.consulta_medica.models.entity.DetalleConsulta;
import com.bootcamp.consulta_medica.models.entity.Especialidad;
import com.bootcamp.consulta_medica.services.DetalleConsultaService;
import com.bootcamp.consulta_medica.services.EspecialidadService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalle-consulta")
public class DetalleConsultaController {
	
	private static final Logger logger = LogManager.getLogger(DetalleConsultaController.class);
	
	@Autowired
	private DetalleConsultaService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<DetalleConsulta> registrar(@RequestBody DetalleConsulta p) {
		logger.info("Registrar nuevo médico");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo registrar el médico");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<DetalleConsulta> actualizar(@RequestBody DetalleConsulta p) throws Exception {
		logger.info("Actualizar detalle consulta");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo actualizar detalle consulta");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<DetalleConsulta> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<DetalleConsulta>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
