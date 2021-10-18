/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.repositorio;

import co.usa.edu.grupo0.ciclo3.modelo.Client;
import co.usa.edu.grupo0.ciclo3.modelo.Computer;
import co.usa.edu.grupo0.ciclo3.modelo.Message;
import co.usa.edu.grupo0.ciclo3.repositorio.cruds.ClientCrudRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author EUSEBIO
 */

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository repoClient;
    
    public List<Client> getAll(){
        return (List<Client>)repoClient.findAll();
    }
    public List<Client> getByIdMessage( int message_id){
        return (List<Client>) repoClient.finByIdMessageOrderByNombreAsc(message_id);
    }
    
   
        
        
//    aqui comienza el problem
    
}