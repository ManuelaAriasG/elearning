package com.elearning.elearning.controller;

import com.elearning.elearning.Curso;
import com.elearning.elearning.Usuario;
import com.elearning.elearning.repository.CursoRepository;
import com.elearning.elearning.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepo;
    @Autowired
    CursoRepository cursoRepo;
    @GetMapping
    public List<Usuario> getAll() {
        return usuarioRepo.findAll();
    }
    @PostMapping
    public Usuario save(@RequestBody Usuario u) {
        return usuarioRepo.save(u);
    }
    @PostMapping("/{id}/inscribir/{cursoId}")
    public Usuario inscribirCurso(@PathVariable Long id, @PathVariable Long cursoId) {
        Usuario usuario = usuarioRepo.findById(id).orElseThrow();
        Curso curso = cursoRepo.findById(cursoId).orElseThrow();
        usuario.getCursosInscritos().add(curso);
        return usuarioRepo.save(usuario);
    }
}

