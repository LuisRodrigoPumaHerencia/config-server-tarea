package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Consulta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_consulta")
	private int idConsulta;
	
	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;
	
	@ManyToOne
	@JoinColumn(name = "idMedico", nullable = false, foreignKey = @ForeignKey(name = "fkConsultaMedico"))
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name = "idEspecialidad", nullable = false, foreignKey = @ForeignKey(name = "fkConsultaEspecialidad"))
	private Especialidad especialidad;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente", nullable = true, foreignKey = @ForeignKey(name = "fkConsultaPaciente"))
	private Paciente paciente;

}
