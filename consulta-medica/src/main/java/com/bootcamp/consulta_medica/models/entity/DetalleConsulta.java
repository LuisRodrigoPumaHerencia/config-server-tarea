package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "detalle_consulta")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetalleConsulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_consulta")
	private int idDetalleConsulta;
	
	@Column(name = "diagnostico", nullable = false, length = 200)
	private String diagnostico;
	@Column(name = "tratamiento", nullable = false, length = 250)
	private String tratamiento;
	@Column(name = "id_consulta", nullable = false)
	private int idConsulta;

}
