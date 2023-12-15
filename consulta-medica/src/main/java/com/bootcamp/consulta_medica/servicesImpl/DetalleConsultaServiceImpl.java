package com.bootcamp.consulta_medica.servicesImpl;

import com.bootcamp.consulta_medica.models.entity.DetalleConsulta;
import com.bootcamp.consulta_medica.models.entity.Especialidad;
import com.bootcamp.consulta_medica.models.repository.DetalleConsultaRepository;
import com.bootcamp.consulta_medica.models.repository.EspecialidadRepository;
import com.bootcamp.consulta_medica.services.DetalleConsultaService;
import com.bootcamp.consulta_medica.services.EspecialidadService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetalleConsultaServiceImpl implements DetalleConsultaService {

	@Autowired
	private DetalleConsultaRepository repo;
	
	@Override
	public void registrar(DetalleConsulta m) throws Exception {
		repo.save(m);
	}

	@Override
	public void modificar(DetalleConsulta m) throws Exception {
		repo.save(m);
	}

	@Override
	public DetalleConsulta buscar(int id) throws Exception {
		Optional<DetalleConsulta> op = repo.findById(id);
		return op.orElse(null);
	}

	@Override
	public List<DetalleConsulta> listarTodos() throws Exception {
		return repo.findAll();
	}

}
