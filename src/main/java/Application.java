

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import model.ClientePF;


/**
 *
 * Spring Boot application starter class
 */
@ComponentScan({"src/main/java, controller, dto, model, repository, service, src/main/resources, templates, cadastro"})
@SpringBootApplication
public class Application {
		
    public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
    	
    }
}
