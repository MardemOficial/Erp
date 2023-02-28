package controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.ClientePesFis;
import dto.ClienteDto;
import service.ClienteService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value="/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
		
	@PostMapping("/{nome}")
	public String saveCliente(@PathVariable ClienteDto clienteDto){
				
		var cliente = new ClientePesFis();		
		BeanUtils.copyProperties(clienteDto, cliente);		
		clienteService.saveCliente(cliente);
		
		return "Seu nome ";
	}
	
	 @RequestMapping(value = "/olamundo/{name}/{age}", method = RequestMethod.GET)
	 public String greetingText(@PathVariable String name , @PathVariable int age) {
      return "Hello " + name + " idade " + age;
     }
}
