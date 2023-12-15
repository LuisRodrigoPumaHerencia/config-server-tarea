package com.bootcamp.consulta_medica.controllers;

import com.bootcamp.consulta_medica.models.entity.Especialidad;
import com.bootcamp.consulta_medica.models.entity.Examen;
import com.bootcamp.consulta_medica.services.EspecialidadService;
import com.bootcamp.consulta_medica.services.ExamenService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
	
	private static final Logger logger = LogManager.getLogger(EspecialidadController.class);
	
	@Autowired
	private EspecialidadService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<Especialidad> registrar(@RequestBody Especialidad p) {
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
	public ResponseEntity<Especialidad> actualizar(@RequestBody Especialidad p) throws Exception {
		logger.info("Actualizar especialidad");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo actualizar la especialidad");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<Especialidad> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Especialidad>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
