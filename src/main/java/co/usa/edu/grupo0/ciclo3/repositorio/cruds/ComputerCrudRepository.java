package co.usa.edu.grupo0.ciclo3.repositorio.cruds;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import co.usa.edu.grupo0.ciclo3.modelo.Computer;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author EUSEBIO
 */
public interface ComputerCrudRepository extends CrudRepository<Computer, Integer>{
  // mismo tipo de datos que colocamos en Id
    
//    @Query(value="select * from computer where category_id = ? order by nombre ASC",
//            nativeQuery = true)
//    public List<Computer> finByIdCategoryOrderByNombreAsc( int idCategory);
}