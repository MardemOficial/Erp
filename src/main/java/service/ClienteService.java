package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import model.*;
import repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClientePesFis cliente;
	@Autowired
	ClienteRepository clienteRepository;
	
	//Salvar Cliente
	@Transactional
	public String saveCliente(ClientePesFis Cliente) {
		clienteRepository.save(cliente);		
		return "Save";
	}
	
}
