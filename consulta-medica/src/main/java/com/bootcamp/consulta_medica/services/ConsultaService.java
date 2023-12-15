package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.Consulta;
import com.bootcamp.consulta_medica.models.entity.ConsultaExamen;

import java.util.List;

public interface ConsultaService {
	
	public void registrar(Consulta e) throws Exception;
	
	public void modificar(Consulta e) throws Exception;
	
	public Consulta buscar(int id) throws Exception;
	
	public List<Consulta> listarTodos() throws Exception;

}
