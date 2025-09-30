package com.project.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/cadastro-usuario")
    public String mostrarCadastro() {
        return "cadastro-usuario";
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }
}

