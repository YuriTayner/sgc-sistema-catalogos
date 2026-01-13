package com.sgc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.validation.BindingResult;

import com.sgc.app.service.UsuarioService;
import com.sgc.app.dto.UsuarioRegisterDTO;

import jakarta.validation.Valid;

@Controller
public class UsuarioController {
    private final UsuarioService usuarioService;
    
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/registerUser")
    public String registrarUsuario(@Valid UsuarioRegisterDTO usuarioDto, BindingResult result, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "pages/registerUser"; // volta para o formulário se houver erros de validação
        }

        usuarioService.cadastrar(usuarioDto);
        redirectAttributes.addFlashAttribute("message", "usuario cadastrado");
        return "redirect:/login";
    }
    // RegisterUser original sem redirect com mensagem
    //     @PostMapping("/registerUser")
    // public String registrarUsuario(Usuario usuario) {
    //     usuarioRepository.save(usuario);
    //     return "redirect:/layout/index";
    // }
}