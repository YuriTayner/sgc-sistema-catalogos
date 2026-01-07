package com.sgc.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sgc.app.models.Usuario;
import com.sgc.app.repository.UsuarioRepository;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registerUser")
    public String registrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }
}