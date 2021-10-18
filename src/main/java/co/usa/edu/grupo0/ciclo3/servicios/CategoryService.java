/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.servicios;

import co.usa.edu.grupo0.ciclo3.modelo.Category;
import co.usa.edu.grupo0.ciclo3.repositorio.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author July
 */

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    private Category Category;
    
     public List<Category> getAll(){
        return categoryRepository.getAll();
    }
     
    public Category getClient(int id){
        Optional<Category> auxcat= categoryRepository.getCategory(id);
        return auxcat.orElse(new Category());
    }

    public Category save(Category category) {
        return categoryRepository.save(Category);
    }
    
}
