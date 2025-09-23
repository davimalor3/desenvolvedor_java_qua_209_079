package com.project.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuleController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/register")
        public String register(){
            return "register";

        }

}
