package com.proyecto.controller;

import com.proyecto.service.ArticuloService;
import com.proyecto.service.PublicacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private PublicacionService publicacionService;
    
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model){ 
        var publicaciones=publicacionService.getPublicaciones();
        model.addAttribute("publicaciones",publicaciones);
        
        var articulos=articuloService.getArticulos(false);
        model.addAttribute("articulos",articulos);
        
        return "index";
    }
}