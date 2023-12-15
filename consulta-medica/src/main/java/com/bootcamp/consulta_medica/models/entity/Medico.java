package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_medico")
	private int idMedico;
	
	@Column(name = "nombres", nullable = false, length = 100)
	private String nombres;
	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;
	@Column(name = "cmp", nullable = false, unique = true)
	private String cmp;
	@Column(name = "dni", nullable = false, length = 8, unique = true)
	private String dni;

}
