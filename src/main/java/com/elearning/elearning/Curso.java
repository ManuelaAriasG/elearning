package com.elearning.elearning;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String descripcion;
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Leccion> lecciones;
}
