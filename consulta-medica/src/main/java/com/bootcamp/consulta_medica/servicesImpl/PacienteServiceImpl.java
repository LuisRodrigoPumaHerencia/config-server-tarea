package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.Paciente;
import com.bootcamp.consulta_medica.models.repository.PacienteRepository;
import com.bootcamp.consulta_medica.services.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository repo;
	
	@Override
	public void registrar(Paciente p) throws Exception {
		repo.save(p);
		
	}

	@Override
	public void modificar(Paciente p) throws Exception {
		repo.save(p);
		
	}

	@Override
	public Paciente buscar(int id) throws Exception {
		Optional<Paciente> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<Paciente> listarTodos() throws Exception {
		return repo.findAll();
	}

}
