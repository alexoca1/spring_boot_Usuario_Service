package com.alexocampo.usuarioservice.service;

import com.alexocampo.usuarioservice.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario saveUsuario(Usuario usuario);

    List<Usuario> getAllUsuarios();

        Usuario getUsuario(String usuario);
}
