package controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.ClientePF;
import dto.ClienteDto;
import service.ClienteService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping("/cadastro")
	public String ind() {
		System.out.println("Entrou em ind");
		return "cadastro/cadastropessoa";
	}
	
	@PostMapping("/cadastro")
	public String saveCliente(ClienteDto clienteDto){
		System.out.println("Entrou em saveCliente");				
		var cliente = new ClientePF();		
		BeanUtils.copyProperties(clienteDto, cliente);		
		clienteService.saveCliente(cliente);
		
		return "redirect:/index";
	}
	
	@GetMapping("/lista")
	public List<ClientePF> listaCliente() {
		
		
		return clienteService.listaClientes();
	}
	
	/** @GetMapping(value = "/{name}/{ages}")
	 public String greetingText(@PathVariable String name , @PathVariable int ages) {
      return "O nome deu certo" + name;
     }*/
}
