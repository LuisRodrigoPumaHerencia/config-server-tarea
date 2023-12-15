package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.ConsultaExamen;

import java.util.List;

public interface ConsultaExamenService {
	
	public void registrar(ConsultaExamen e) throws Exception;
	
	public void modificar(ConsultaExamen e) throws Exception;
	
	public ConsultaExamen buscar(int id) throws Exception;
	
	public List<ConsultaExamen> listarTodos() throws Exception;

}
