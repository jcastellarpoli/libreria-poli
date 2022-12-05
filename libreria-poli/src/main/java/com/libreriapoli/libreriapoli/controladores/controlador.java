package com.libreriapoli.libreriapoli.controladores;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.libreriapoli.libreriapoli.configuracion.ManejadorImagenes;
import com.libreriapoli.libreriapoli.interfacesServicios.ILibroService;
import com.libreriapoli.libreriapoli.modelos.Libros;

@Controller
@RequestMapping
public class controlador {

    @Autowired
    private ILibroService service;
    private Object svcLibros;

    public Object getSvcLibros()
    {
        return svcLibros;
    }

    public void setSvcLibros(Object svcLibros) 
    {
        this.svcLibros = svcLibros;
    }

    @GetMapping("/")
    public String listar(Model model) 
    {
        List<Libros> libro = service.listar();

        model.addAttribute("libro", libro);

        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) 
    {

        model.addAttribute("libros", new Libros());

        model.addAttribute("nuevo", true);

        return "form";

    }
    @PostMapping("/save/{nuevo}")
    public String save(@Validated  Libros l, Model model, @RequestParam("imagen") MultipartFile imagen, @PathVariable("nuevo") boolean nuevo) throws Exception 
    {
        String rutaImagen;

        rutaImagen = ManejadorImagenes.GuardarArchivoImagen(imagen, nuevo, l.getImagen());

        l.setImagen(rutaImagen);

        service.save(l);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){

        Optional<Libros>libros=service.listarId(id);

        model.addAttribute("libros", libros);

        model.addAttribute("nuevo", false);

        return "form" ;
    }
    @GetMapping("/detalle_libro/{id}")
    public String detalle_libro(@PathVariable int id, Model model){

        Optional<Libros>libros=service.listarId(id);

        model.addAttribute("libros", libros);

        return "detalle_libro" ;
    }
    

    @GetMapping("/eliminar/{id}")
    public String  delete(Model model, @PathVariable int id){

        service.delete(id);

        return "redirect:/";
    }

}
