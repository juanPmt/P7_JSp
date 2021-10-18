/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.repositorio.crud;

import org.springframework.data.repository.CrudRepository;
import co.usa.edu.grupo0.ciclo3.modelo.Category;

/**
 *
 * @author July
 */
public interface CategoryCrudRepository extends CrudRepository <Category, Integer> {
    
    
}
