package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.Especialidad;
import com.bootcamp.consulta_medica.models.entity.Examen;
import com.bootcamp.consulta_medica.models.repository.EspecialidadRepository;
import com.bootcamp.consulta_medica.models.repository.ExamenRepository;
import com.bootcamp.consulta_medica.services.EspecialidadService;
import com.bootcamp.consulta_medica.services.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository repo;
	
	@Override
	public void registrar(Especialidad m) throws Exception {
		repo.save(m);
	}

	@Override
	public void modificar(Especialidad m) throws Exception {
		repo.save(m);
	}

	@Override
	public Especialidad buscar(int id) throws Exception {
		Optional<Especialidad> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<Especialidad> listarTodos() throws Exception {
		return repo.findAll();
	}

}
