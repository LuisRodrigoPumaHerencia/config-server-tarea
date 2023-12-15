package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.Examen;
import com.bootcamp.consulta_medica.models.entity.Medico;
import com.bootcamp.consulta_medica.models.repository.ExamenRepository;
import com.bootcamp.consulta_medica.services.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamenServiceImpl implements ExamenService {

	@Autowired
	private ExamenRepository repo;
	
	@Override
	public void registrar(Examen m) throws Exception {
		repo.save(m);
	}

	@Override
	public void modificar(Examen m) throws Exception {
		repo.save(m);
		
	}

	@Override
	public Examen buscar(int id) throws Exception {
		Optional<Examen> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<Examen> listarTodos() throws Exception {
		return repo.findAll();
	}

}
