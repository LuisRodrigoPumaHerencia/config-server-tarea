package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "consulta_examen")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConsultaExamen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_consulta_examen")
	private int idConsultaExamen;

	@Column(name = "id_consulta", nullable = false)
	private int idConsulta;

	@Column(name = "id_examen", nullable = false)
	private int idExamen;

}
