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
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author EUSEBIO
 */
@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository crudClient;

    public List<Client> getAll() {
        return (List<Client>) crudClient.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return crudClient.findById(id);
    }

    public Client save(Client client){
        return crudClient.save(client);
    }  
    
}
