package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
