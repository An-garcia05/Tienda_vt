/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

/**
 *
 * @author angie
 */
public interface CategoriaService {
    
    // Se recuperan los registros d ela tabla categoria en un 
    //ArrayList d eobjtos Categoria. Todos  o solo los activos
    
    public List<Categoria> getCategorias(boolean activos);
    
}
