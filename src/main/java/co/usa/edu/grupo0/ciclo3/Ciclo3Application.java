package co.usa.edu.grupo0.ciclo3;

//import co.usa.edu.grupo0.ciclo3.repositorio.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"co.usa.edu.grupo0.ciclo3"})
@EntityScan(basePackages = {"co.usa.edu.grupo0.ciclo3.modelo"})
@SpringBootApplication

public class Ciclo3Application {
    


	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}
  

}
   
