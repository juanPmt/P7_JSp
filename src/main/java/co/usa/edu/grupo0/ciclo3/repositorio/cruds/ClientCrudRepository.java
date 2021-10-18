/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.repositorio.cruds;

import co.usa.edu.grupo0.ciclo3.modelo.Client;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author EUSEBIO
 */
public interface ClientCrudRepository  extends CrudRepository<Client, Integer>{
  // mismo tipo de datos que colocamos en Id
    
//    @Query(value="select * from client where message_id = ? order by nombre ASC",
//            nativeQuery = true)
//    public List<Client> finByIdMessageOrderByNombreAsc( int idMessage);
    
//    ojo con esto

    
    
    
}