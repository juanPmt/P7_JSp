package co.usa.edu.grupo0.ciclo3;

import co.usa.edu.grupo0.ciclo3.modelo.Computer;
import co.usa.edu.grupo0.ciclo3.modelo.Category;
import co.usa.edu.grupo0.ciclo3.modelo.Client;
import co.usa.edu.grupo0.ciclo3.modelo.Message;
import co.usa.edu.grupo0.ciclo3.repositorio.ComputerRepository;
import co.usa.edu.grupo0.ciclo3.repositorio.CategoryRepository;
import co.usa.edu.grupo0.ciclo3.repositorio.ClientRepository;
import co.usa.edu.grupo0.ciclo3.repositorio.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"co.usa.edu.grupo0.ciclo3"})
public class Ciclo3Application {
    
    @Autowired
    private ComputerRepository crudComputer;
    @Autowired
    private CategoryRepository crudCategory ;
    
    
    @Autowired
    private ClientRepository crudClient;
    @Autowired
    private MessageRepository crudMessage ;

    public static void main(String[] args) {
    SpringApplication.run(Ciclo3Application.class, args);
    }
    
    @Bean
    ApplicationRunner applicationRunner(){
        return args -> {
            List<Computer> rcom = crudComputer.getAll();
            System.out.println("Computers: "+rcom.size());
            
            List<Category> rcat= crudCategory.getAll();
            System.out.println("Categories: "+rcat.size());
            
            List<Client> rcli= crudClient.getAll();
            System.out.println("Clients: "+rcli.size());
            
            List<Message> rmess= crudMessage.getAll();
            System.out.println("Messages: "+rmess.size());
            
            
        };
    }

}
