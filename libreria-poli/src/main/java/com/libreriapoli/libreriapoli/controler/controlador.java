package com.libreriapoli.libreriapoli.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreriapoli.libreriapoli.interfaceService.ILibroService;
import com.libreriapoli.libreriapoli.modelo.Libros;

@Controller
@RequestMapping
public class controlador {

    @Autowired
    private ILibroService service;
    private Object svcLibros;

    @GetMapping("/")
    public String listar(Model model) {
        List<Libros> libro = service.listar();
        model.addAttribute("libro", libro);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("libros", new Libros());
        return "form";

    }
    @PostMapping("/save")
    public String save(@Validated  Libros l, Model model) {
        service.save(l);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Libros>libros=service.listarId(id);
        model.addAttribute("libros", libros);
        return "form" ;
    }
    @GetMapping("/detalle_libro/{id}")
    public String detalle_libro(@PathVariable int id, Model model){
        Optional<Libros>libros=service.listarId(id);
        model.addAttribute("libros", libros);
        return "detalle_libro" ;
    }
    

    @GetMapping("/eliminar/{id}")
    public String  eliminar(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/";
    }

}
