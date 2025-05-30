package com.elearning.elearning;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Leccion {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String contenido;
    @ManyToOne
    private Curso curso;
}
