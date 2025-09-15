package com.crud.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    // =========== CREATE - CRUD
    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Pessoa usuario) {
        csr.save(usuario);
        return "redirect:/register";
    }

    // ========== READ - CRUD
    // list to all registred users
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(){
        ModelAndView mv = new ModelAndView("search");
        Iterable<Pessoa> users = csr.findAll();
        mv.addObject("users", users);
        return mv;
    }
}
