package com.project.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.app.entities.Usuarios;
import com.project.app.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/salvar")
    public String salvarUsuario(Usuarios usuario, Model model) {
        if (usuarioRepository.existsByUsername(usuario.getUsername())) {
            model.addAttribute("erro", "Nome de usuário já existe!");
            return "redirect:/success";
        }

        // Salva a senha em texto puro
        usuarioRepository.save(usuario);

        return "redirect:/login";
    }
}
