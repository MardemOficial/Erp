

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.ClientePesFis;


/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication
public class Application {
		
    public static void main(String[] args) {
   //     SpringApplication.run(Application.class, args);
    	ClientePesFis cliente = new ClientePesFis();
    	
    	cliente.setCpf("60617266352");
    	
    	System.out.println(cliente.getCpf());
    	
    }
}
