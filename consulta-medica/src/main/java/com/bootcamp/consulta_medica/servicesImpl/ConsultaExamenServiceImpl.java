package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.ConsultaExamen;
import com.bootcamp.consulta_medica.models.entity.DetalleConsulta;
import com.bootcamp.consulta_medica.models.repository.ConsultaExamenRepository;
import com.bootcamp.consulta_medica.models.repository.DetalleConsultaRepository;
import com.bootcamp.consulta_medica.services.ConsultaExamenService;
import com.bootcamp.consulta_medica.services.DetalleConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsultaExamenServiceImpl implements ConsultaExamenService {

	@Autowired
	private ConsultaExamenRepository repo;
	
	@Override
	public void registrar(ConsultaExamen m) throws Exception {
		repo.save(m);
	}

	@Override
	public void modificar(ConsultaExamen m) throws Exception {
		repo.save(m);
	}

	@Override
	public ConsultaExamen buscar(int id) throws Exception {
		Optional<ConsultaExamen> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<ConsultaExamen> listarTodos() throws Exception {
		return repo.findAll();
	}

}
