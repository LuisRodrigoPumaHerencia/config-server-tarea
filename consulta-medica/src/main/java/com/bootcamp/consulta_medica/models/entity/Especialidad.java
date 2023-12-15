package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidad")
	private int idEspecialidad;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;

}
