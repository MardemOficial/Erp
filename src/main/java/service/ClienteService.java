package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import model.*;
import repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired(required = false)
	ClienteRepository clienteRepository;
	
	//Salvar Cliente
	@Transactional
	public String saveCliente(ClientePF cliente) {
		clienteRepository.save(cliente);		
		return "Save";
	}
	
	public List<ClientePF> listaClientes(){
		return this.clienteRepository.findAll();
	}
	
}
