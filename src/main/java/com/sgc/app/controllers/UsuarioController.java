package com.sgc.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sgc.app.models.Usuario;
import com.sgc.app.repository.UsuarioRepository;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/registerUser")
    public String registrarUsuario(Usuario usuario, RedirectAttributes redirectAttributes) {
        usuarioRepository.save(usuario);
        redirectAttributes.addAttribute("message", "usuario cadastrado");
        return "redirect:/";
    }
    // RegisterUser original sem redirect com mensagem
    //     @PostMapping("/registerUser")
    // public String registrarUsuario(Usuario usuario) {
    //     usuarioRepository.save(usuario);
    //     return "redirect:/layout/index";
    // }
}