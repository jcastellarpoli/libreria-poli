package com.libreriapoli.libreriapoli.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreriapoli.libreriapoli.interfacesServicios.IModeloPruebaService;
import com.libreriapoli.libreriapoli.modelos.ModeloPrueba;

@Controller
@RequestMapping(path = "modelosPrueba")
public class ModeloPruebaController {
    
    @Autowired
    private IModeloPruebaService modeloPruebaService;
    
    @GetMapping("/")
    public String ListarModelos(Model model)
    {
        List<ModeloPrueba> modelos;
        
        modelos = modeloPruebaService.ListarModelos();

        model.addAttribute("data", modelos);

        return "listarModelos";
    }

}
