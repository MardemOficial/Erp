package model;

import java.util.List;

public abstract class Pessoa {
	
	//cpf ou cpnj 
	private int cp;
	private String nomeCompleto;
	private List<Endereco> endereco;
	
	
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
