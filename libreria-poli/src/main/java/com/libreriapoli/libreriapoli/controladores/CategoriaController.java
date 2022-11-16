package com.libreriapoli.libreriapoli.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreriapoli.libreriapoli.interfacesServicios.ICategoriasService;
import com.libreriapoli.libreriapoli.modelos.Categorias;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/views/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriasService variable;
    @GetMapping("/")
    public String listarCategotias(Model model){
        List<Categorias> listadoCategorias = variable.listarTodos();
        model.addAttribute("titulo", "Lista de Clientes");
        return "/views/categorias/listar";
    }
    
}
