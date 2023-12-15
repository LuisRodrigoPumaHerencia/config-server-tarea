package com.bootcamp.consulta_medica.controllers;

import com.bootcamp.consulta_medica.models.entity.Medico;
import com.bootcamp.consulta_medica.services.MedicoService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	private static final Logger logger = LogManager.getLogger(MedicoController.class);
	
	@Autowired
	private MedicoService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<Medico> registrar(@RequestBody Medico m) {
		logger.info("Registrar nuevo médico");
		try {
			service.registrar(m);
			return ResponseEntity.ok(m);
		} catch (Exception e) {
			logger.error("No se pudo registrar el médico");
			logger.debug(e);
			return ResponseEntity.badRequest().body(m);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Medico> actualizar(@RequestBody Medico m) throws Exception {
		logger.info("Registrar nuevo médico");
		try {
			service.registrar(m);
			return ResponseEntity.ok(m);
		} catch (Exception e) {
			logger.error("No se pudo registrar el médico");
			logger.debug(e);
			return ResponseEntity.badRequest().body(m);
		}
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<Medico> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Medico>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
