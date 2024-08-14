
package com.tienda.controller;

import com.tienda.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author angie
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
     @Autowired
    private CategoriaService categoriaServices;
     
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = categoriaServices.getCategorias(false);
        model.addAttribute("categorias", lista);
        model.addAttribute("totalCategorias", lista.size());
        return "/categoria/listado";

    
    }

    
}
