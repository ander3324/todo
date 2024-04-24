package com.analistas.todo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/home"})
    public String home(Model model){

        model.addAttribute("titulo", "Bienvenido a la aplicación de tareas");
        model.addAttribute("saludo", "Hola Mundo");

        return "home";
    }
}
