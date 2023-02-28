package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Pattern;


@Entity
public class ClientePesJuri extends Pessoa {

	@Column(nullable = false, length = 14)
	@Pattern(regexp = "(^\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}$)")
	private int cnpj;
	private int insEstatual;
	private int insMunicipal;
	//identifica se uma empresa é uma matriz ou filial
	enum unidadeDeNegocio {MATRIZ, FILIAL};

	
	public ClientePesJuri() {
		// TODO Auto-generated constructor stub
	}
	
}
