package com.project.app.controllers;

import com.project.app.entities.PessoaDesaparecida;
import com.project.app.repository.PessoaDesaparecidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class PessoaDesaparecidaController {

    @Autowired
    private PessoaDesaparecidaRepository repository;

    // ======= CRUD - CADASTRAR(create)
    @PostMapping("/public/salvar")
    public String salvarPessoa(@ModelAttribute PessoaDesaparecida pessoa) {
        repository.save(pessoa);
        return "redirect:/success"; // redireciona para a página de sucesso
    }

    // ======= CRUD - LISTAR(read)
    @GetMapping("/public/buscar")
    public String listarPessoas(Model model) {
        List<PessoaDesaparecida> pessoas = repository.findAll();
        model.addAttribute("pessoas", pessoas);
        return "buscar";
    }

}
