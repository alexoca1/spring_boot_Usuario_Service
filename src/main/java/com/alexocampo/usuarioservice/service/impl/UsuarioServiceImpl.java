package com.alexocampo.usuarioservice.service.impl;

import com.alexocampo.usuarioservice.entity.Usuario;
import com.alexocampo.usuarioservice.exceptions.ResourceNOtFoundException;
import com.alexocampo.usuarioservice.repository.UsuarioRepository;
import com.alexocampo.usuarioservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario saveUsuario(Usuario usuario) {
        String randomUsuarioId = UUID.randomUUID().toString();
        usuario.setUsuarioId(randomUsuarioId);
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuario(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNOtFoundException("Usuario no encontrado con el ID : " + usuarioId));
    }
}
