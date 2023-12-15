package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.Medico;
import com.bootcamp.consulta_medica.models.repository.MedicoRepository;
import com.bootcamp.consulta_medica.services.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MedicoServiceImpl implements MedicoService {

	@Autowired
	private MedicoRepository repo;
	
	@Override
	public void registrar(Medico m) throws Exception {
		repo.save(m);
	}

	@Override
	public void modificar(Medico m) throws Exception {
		repo.save(m);
		
	}

	@Override
	public Medico buscar(int id) throws Exception {
		Optional<Medico> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<Medico> listarTodos() throws Exception {
		return repo.findAll();
	}

}
