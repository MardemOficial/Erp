package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Pattern;


@Entity
public class ClientePJ extends Pessoa {

	@Column(nullable = false, length = 14)
	private int cnpj;
	private int insEstatual;
	private int insMunicipal;
	//identifica se uma empresa é uma matriz ou filial
	enum unidadeDeNegocio {MATRIZ, FILIAL};

	
	public ClientePJ() {
		// TODO Auto-generated constructor stub
	}
	
}
