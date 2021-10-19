/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.web;

import co.usa.edu.grupo0.ciclo3.modelo.Category;
import co.usa.edu.grupo0.ciclo3.servicios.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author July
 */



@RestController
@RequestMapping("/api/Client")
//Importar CrossDrigin No me deja dice que no existe. 

public class CategoryController {
    
   @Autowired
   private CategoryService categoryService;
   
   @GetMapping("/all")
   public List<Category> getCategories(){
       return categoryService.getAll();
   }
   
  @GetMapping("/{id}")//Nuevo metodo donde editata id 
    public Category getCategory(@PathVariable("id")int id){
        return categoryService.getClient(id);
   }
   
   @PostMapping("/save")
   @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
    
}
