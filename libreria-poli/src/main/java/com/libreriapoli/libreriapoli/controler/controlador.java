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

import javax.imageio.ImageIO;
import javax.validation.Valid;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
@Controller
@RequestMapping
public class controlador {

    @Autowired
    private ILibroService service;
    private Object svcLibros;

    public Object getSvcLibros() {
        return svcLibros;
    }

    public void setSvcLibros(Object svcLibros) {
        this.svcLibros = svcLibros;
    }

    @GetMapping("/")
    public String listar(Model model) {
        try{
            List<Libros> libro = service.listar();
            model.addAttribute("libro", libro);
            return "index";
        }catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "error";
        }
        
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        try{
            model.addAttribute("libros", new Libros());
            return "form";
        }catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "error";
        }     
    }
    @PostMapping("/save")
    
    public String save(@Validated  Libros l, Model model) {
        @RequestParam("archivo") MultipartFile archivo,
        @Valid @ModelAttribute("Libros") Libros Libros,
            BindingResult result,
            Model model,@PathVariable("id")long id
        try{
            String ruta = "C://Users/User/java/video_juego/practicas-profesionales/videojuegos/imagenes/";
            int index = archivo.getOriginalFilename().indexOf(".");
            String extension = "";
            extension = "."+archivo.getOriginalFilename().substring(index+1);
            String nombreFoto = Calendar.getInstance().getTimeInMillis()+extension;
            Path rutaAbsoluta = id != 0 ? Paths.get(ruta + "//"+videojuego.getImagen()) :
            Paths.get(ruta+"//"+nombreFoto);

            Files.write(rutaAbsoluta,archivo.getBytes());
            Libros.setImagen(nombreFoto);
            this.svcVideojuego.saveOne(Libros);
            service.save(l);
            return "redirect:/";
        }catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "error";
        } 
        
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        try{
            Optional<Libros>libros=service.listarId(id);
            model.addAttribute("libros", libros);
            return "form" ; 
        }catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "error";
        }
       
    }
    @GetMapping("/detalle_libro/{id}")
    public String detalle_libro(@PathVariable int id, Model model){
        try{
            Optional<Libros>libros=service.listarId(id);
            model.addAttribute("libros", libros);
            return "detalle_libro" ;
        }catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "error";
        }

        
    }
    

    @GetMapping("/eliminar/{id}")
    public String  delete(Model model, @PathVariable int id){
        try{
            service.delete(id);
            return "redirect:/";
        }catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "error";
        }
        
    }

}
