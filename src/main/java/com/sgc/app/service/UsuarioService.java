package com.sgc.app.service;

import org.springframework.stereotype.Service;

import com.sgc.app.dto.UsuarioRegisterDTO;
import com.sgc.app.models.Usuario;
import com.sgc.app.repository.UsuarioRepository;


@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrar(UsuarioRegisterDTO usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setNomeUsuario(usuarioDto.getNomeUsuario());
        usuario.setEmailUsuario(usuarioDto.getEmailUsuario());
        usuario.setSenha(usuarioDto.getSenha()); // ideal: aplicar hash antes de salvar
        usuarioRepository.save(usuario);
    }
}