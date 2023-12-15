package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.Especialidad;
import com.bootcamp.consulta_medica.models.entity.Examen;

import java.util.List;

public interface EspecialidadService {
	
	public void registrar(Especialidad e) throws Exception;
	
	public void modificar(Especialidad e) throws Exception;
	
	public Especialidad buscar(int id) throws Exception;
	
	public List<Especialidad> listarTodos() throws Exception;

}
