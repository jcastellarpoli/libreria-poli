package com.libreriapoli.libreriapoli.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreriapoli.libreriapoli.interfaceService.ILibroService;
import com.libreriapoli.libreriapoli.modelo.Libros;

@Controller
@RequestMapping
public class controlador {

        @Autowired
        private ILibroService service;

        @GetMapping("/listar")
        public String listar(Model model){
            List<Libros>libro=service.listar();
            model.addAttribute("libro", libro) ;
            return "index";
        }
}
