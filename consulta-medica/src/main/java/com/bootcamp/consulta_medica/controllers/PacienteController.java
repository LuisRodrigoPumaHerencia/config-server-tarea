package com.bootcamp.consulta_medica.controllers;

import com.bootcamp.consulta_medica.models.entity.Paciente;
import com.bootcamp.consulta_medica.services.PacienteService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	private static final Logger logger = LogManager.getLogger(PacienteController.class);
	
	@Autowired
	private PacienteService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<Paciente> registrar(@RequestBody Paciente p) {
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
	public ResponseEntity<Paciente> actualizar(@RequestBody Paciente p) throws Exception {
		logger.info("Actualizar paciente");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo actualizar al paciente");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<Paciente> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Paciente>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
