package com.project.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/cadastro/desaparecido")
    public String register() {
        return "cadastro-desaparecido";
    }

    @RequestMapping("/success")
    public String success() {
        return "cadastro-success";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/register")
    public String registerUser() {
        return "register";
    }

    @RequestMapping("/comofunciona")
    public String comoFunciona() {
        return "como-funciona";
    }
}
