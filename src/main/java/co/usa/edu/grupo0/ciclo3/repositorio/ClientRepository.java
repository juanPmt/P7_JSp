/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.edu.grupo0.ciclo3.repositorio;

import co.usa.edu.grupo0.ciclo3.modelo.Client;
import org.springframework.stereotype.Repository;
import co.usa.edu.grupo0.ciclo3.repositorio.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author July
 */
@Repository
public class ClientRepository {
    
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    
    public List<Client> getAll(){   
    return (List<Client>)clientCrudRepository.findAll();
    }
    
    public Optional<Client> getClient(int idClient){
        return clientCrudRepository.findById(idClient);
    }
    
    public Client save(Client client){
        return clientCrudRepository.save(client);
    }  
    
    
}
