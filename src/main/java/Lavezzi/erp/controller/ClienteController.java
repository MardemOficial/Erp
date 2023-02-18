package Lavezzi.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Lavezzi.erp.model.Cliente;
import Lavezzi.erp.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
		
	@GetMapping("/{nome}")
	public String saveCliente(@PathVariable String nome){
				
		clienteRepository.save(new Cliente(nome, 12));
		
		return "Seu nome é: " + nome + " e tua idade é 12";
	}
	
	 @RequestMapping(value = "/olamundo/{name}/{age}", method = RequestMethod.GET)
	 @ResponseStatus(HttpStatus.OK)
	 public String greetingText(@PathVariable String name , @PathVariable int age) {
      return "Hello " + name + " idade " + age;
     }
}
