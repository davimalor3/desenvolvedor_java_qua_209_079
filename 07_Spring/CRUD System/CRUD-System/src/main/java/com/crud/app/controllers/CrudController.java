package com.crud.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;

//Imports para paginação
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Controller
public class CrudController {
    @Autowired
    private AppRepository csr;

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    // =========== CREATE - CRUD
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Pessoa usuario) {
        csr.save(usuario);
        return "redirect:/register";
    }

    // ========== READ - CRUD (PAGINAÇÃO)
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(@RequestParam(defaultValue = "0") int page) {
        int pageSize = 15;

        Pageable pageable = PageRequest.of(page, pageSize);
        Page<Pessoa> users = csr.findAll(pageable);

        ModelAndView mv = new ModelAndView("search");
        mv.addObject("users", users.getContent());
        mv.addObject("currentPage", page);
        mv.addObject("totalPages", users.getTotalPages());
        return mv;
    }

    // UPDATE - CRUD
    @RequestMapping(value = "/updateUser/{idPessoa}", method = RequestMethod.GET)
    public ModelAndView updateUser(@PathVariable("idPessoa") long idPessoa) {
        Pessoa user = csr.findByIdPessoa(idPessoa);
        ModelAndView mv = new ModelAndView("updateUser");
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping(value = "/updateUser/{idPessoa}", method = RequestMethod.POST)
    public String updateUser(@Validated Pessoa user, BindingResult result, RedirectAttributes attributes) {
        csr.save(user);
        return "redirect:/search";
    }

    // DELETE - CRUD
    @RequestMapping("/confirmDelete/{idPessoa}")
    public ModelAndView confirmDelete(@PathVariable("idPessoa") long idPessoa) {
        Pessoa user = csr.findByIdPessoa(idPessoa);
        ModelAndView mv = new ModelAndView("deleteUser");
        mv.addObject("user", user);
        return mv;
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(long idPessoa) {
        Pessoa user = csr.findByIdPessoa(idPessoa);
        csr.delete(user);
        return "redirect:/search";
    }




    // ========== READ - CRUD (ANTIGO)
    // list to all registred users
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(){
    ModelAndView mv = new ModelAndView("search");
    Iterable<Pessoa> users = csr.findAll();
    mv.addObject("users", users);
    return mv;
    }





    // CRUD CONCEPT
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }

}
