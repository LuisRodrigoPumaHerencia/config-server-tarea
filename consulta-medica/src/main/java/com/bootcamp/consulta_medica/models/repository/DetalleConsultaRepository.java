package com.bootcamp.consulta_medica.models.repository;

import com.bootcamp.consulta_medica.models.entity.DetalleConsulta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleConsultaRepository extends MongoRepository<DetalleConsulta, Integer> {

}
