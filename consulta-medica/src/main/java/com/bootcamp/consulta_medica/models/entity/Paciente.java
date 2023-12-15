package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
	private int idPaciente;
	
	@Column(name = "nombres", nullable = false, length = 100)
	private String nombres;
	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;
	@Column(name = "dni", nullable = false, length = 8, unique = true)
	private String dni;
	@Column(name = "direccion", nullable = false, length = 250)
	private String direccion;
	@Column(name = "telefono", nullable = false, length = 9)
	private String telefono;
	@Column(name = "email", nullable = false, length = 50)
	private String email;

}
