package com.elearning.elearning.repository;

import com.elearning.elearning.Curso;
import com.elearning.elearning.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}