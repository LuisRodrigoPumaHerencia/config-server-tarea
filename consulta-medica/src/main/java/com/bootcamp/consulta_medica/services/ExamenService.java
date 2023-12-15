package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.Examen;

import java.util.List;

public interface ExamenService {
	
	public void registrar(Examen e) throws Exception;
	
	public void modificar(Examen e) throws Exception;
	
	public Examen buscar(int id) throws Exception;
	
	public List<Examen> listarTodos() throws Exception;

}
