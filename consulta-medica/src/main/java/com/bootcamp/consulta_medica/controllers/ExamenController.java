package com.bootcamp.consulta_medica.controllers;

import com.bootcamp.consulta_medica.models.entity.Examen;
import com.bootcamp.consulta_medica.models.entity.Paciente;
import com.bootcamp.consulta_medica.services.ExamenService;
import com.bootcamp.consulta_medica.services.PacienteService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examenes")
public class ExamenController {
	
	private static final Logger logger = LogManager.getLogger(ExamenController.class);
	
	@Autowired
	private ExamenService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<Examen> registrar(@RequestBody Examen p) {
		logger.info("Registrar nuevo examen");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo registrar el examen");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Examen> actualizar(@RequestBody Examen p) throws Exception {
		logger.info("Actualizar examen");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo actualizar el examen");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<Examen> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Examen>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
