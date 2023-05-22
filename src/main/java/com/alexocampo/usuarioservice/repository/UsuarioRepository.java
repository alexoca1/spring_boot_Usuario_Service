package com.alexocampo.usuarioservice.repository;

import com.alexocampo.usuarioservice.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,String> {
}
