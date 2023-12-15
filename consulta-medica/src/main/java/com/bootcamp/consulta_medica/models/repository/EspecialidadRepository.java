package com.bootcamp.consulta_medica.models.repository;

import com.bootcamp.consulta_medica.models.entity.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {

}
