package model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa {
	
	//cpf ou cpnj
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	@Column(nullable = false, length = 100)
	private String nomeCompleto;
	@Column(nullable = false, length = 100)
	private List<Endereco> endereco;
	
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nomeCompleto, UUID id, List<Endereco> endereco) {
		this.nomeCompleto = nomeCompleto;
		this.id = id;
		this.endereco = endereco;
	}


	public UUID getCp() {
		return this.id;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	

	
}
