package com.libreriapoli.libreriapoli.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.libreriapoli.libreriapoli.interfaces.iGenero;
import com.libreriapoli.libreriapoli.interfacesServicios.genero;
import com.libreriapoli.libreriapoli.interfacesServicios.igeneroservices;
import com.libreriapoli.libreriapoli.modelos.Genero;


@Controller
@RequestMapping


public class controlgenero {

    @Autowired
    private igeneroservices service;

    @GetMapping("/listar")
    public String list(Model model) {
        List<Genero>genero=service.listar();
        model.addAttribute("genero",genero);
        return "listar";
    }

    
    @GetMapping("/crear")

    public String agregar(Model model){
        model.addAttribute("genero", new genero());

        return "form";

    }

    @PostMapping
    public String save(@Validated Genero g, Model model){
        service.Save(g);
        return"redirect:/listar";
    }



    @PostMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model modelo){
        com.libreriapoli.libreriapoli.interfacesServicios.list<Genero>genero=service.listar(id);
        modelo.addAttribute("genero", genero);
        return"form";
    }



}
