package com.bootcamp.consulta_medica.controllers;

import com.bootcamp.consulta_medica.models.entity.Consulta;
import com.bootcamp.consulta_medica.services.ConsultaService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
	private static final Logger logger = LogManager.getLogger(ConsultaController.class);
	
	@Autowired
	private ConsultaService service;
	
	@PostMapping(value = "/nuevo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Consulta> registrar(@RequestBody Consulta p) {
		logger.info("Registrar nuevo médico");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo registrar la consulta");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Consulta> actualizar(@RequestBody Consulta p) throws Exception {
		logger.info("Actualizar consulta");
		try {
			service.registrar(p);
			return ResponseEntity.ok(p);
		} catch (Exception e) {
			logger.error("No se pudo actualizar la consulta");
			logger.debug(e);
			return ResponseEntity.badRequest().body(p);
		}
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<Consulta> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Consulta>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
