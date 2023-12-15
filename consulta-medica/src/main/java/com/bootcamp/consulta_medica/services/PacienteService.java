package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.Paciente;

import java.util.List;

public interface PacienteService {
	
	public void registrar(Paciente p) throws Exception;
	
	public void modificar(Paciente p) throws Exception;
	
	public Paciente buscar(int id) throws Exception;
	
	public List<Paciente> listarTodos() throws Exception;

}
