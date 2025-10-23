package com.example.crud.service;

import com.example.crud.repository.UsuarioRepository;
import com.example.crud.model.Usuario;

import java.util.List;

public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
    
    public Usuario getUsuarioById(java.util.UUID id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
