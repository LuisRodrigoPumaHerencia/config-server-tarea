package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.Consulta;
import com.bootcamp.consulta_medica.models.repository.ConsultaRepository;
import com.bootcamp.consulta_medica.services.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	private ConsultaRepository repo;
	
	@Override
	public void registrar(Consulta m) throws Exception {
		repo.save(m);
	}

	@Override
	public void modificar(Consulta m) throws Exception {
		repo.save(m);
	}

	@Override
	public Consulta buscar(int id) throws Exception {
		Optional<Consulta> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<Consulta> listarTodos() throws Exception {
		return repo.findAll();
	}

}
