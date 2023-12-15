package com.bootcamp.consulta_medica.services;

import com.bootcamp.consulta_medica.models.entity.Medico;

import java.util.List;

public interface MedicoService {
	
	public void registrar(Medico m) throws Exception;
	
	public void modificar(Medico m) throws Exception;
	
	public Medico buscar(int id) throws Exception;
	
	public List<Medico> listarTodos() throws Exception;

}
