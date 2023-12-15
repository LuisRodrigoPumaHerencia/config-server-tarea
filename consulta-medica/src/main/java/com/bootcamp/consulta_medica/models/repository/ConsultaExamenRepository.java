package com.bootcamp.consulta_medica.models.repository;

import com.bootcamp.consulta_medica.models.entity.ConsultaExamen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaExamenRepository extends MongoRepository<ConsultaExamen, Integer> {
}
