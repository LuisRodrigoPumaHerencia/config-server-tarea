package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.DetalleConsulta;
import com.bootcamp.consulta_medica.models.entity.Especialidad;

import java.util.List;

public interface DetalleConsultaService {
	
	public void registrar(DetalleConsulta e) throws Exception;
	
	public void modificar(DetalleConsulta e) throws Exception;
	
	public DetalleConsulta buscar(int id) throws Exception;
	
	public List<DetalleConsulta> listarTodos() throws Exception;

}
