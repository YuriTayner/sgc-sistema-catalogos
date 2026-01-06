package com.sgc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Controller da pagina inicial
@Controller
public class PageController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("content", "pages/home :: content");
        return "layout/index";
    }

    @GetMapping("/registerUser")
    public String register(Model model) {
        model.addAttribute("content", "pages/registerUser :: content");
        return "layout/index";
    }
}