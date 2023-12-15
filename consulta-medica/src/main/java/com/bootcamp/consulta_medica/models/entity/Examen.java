package com.bootcamp.consulta_medica.models.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_examen")
    private int idExamen;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 250)
    private String descripcion;
}
