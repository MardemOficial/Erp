package model;

import java.util.List;

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
	private int cp;
	@Column(nullable = false, length = 100)
	private String nomeCompleto;
	@Column(nullable = false, length = 100)
	private List<Endereco> endereco;
	
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nomeCompleto, int cp, List<Endereco> endereco) {
		this.nomeCompleto = nomeCompleto;
		this.cp = cp;
		this.endereco = endereco;
	}


	public int getCp() {
		return cp;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	

	
}
