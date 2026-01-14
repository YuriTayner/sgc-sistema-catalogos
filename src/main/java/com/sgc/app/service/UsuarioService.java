package com.sgc.app.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sgc.app.dto.UsuarioRegisterDTO;
import com.sgc.app.models.Usuario;
import com.sgc.app.repository.UsuarioRepository;


@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void cadastrar(UsuarioRegisterDTO usuarioDto) {
        Usuario usuario = new Usuario();
        usuario.setNomeUsuario(usuarioDto.getNomeUsuario());
        usuario.setEmailUsuario(usuarioDto.getEmailUsuario());
        usuario.setSenha(passwordEncoder.encode(usuarioDto.getSenha()));
        usuarioRepository.save(usuario);
    }
}