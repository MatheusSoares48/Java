package aula_08.model;

import aula_08.util.Cliente;

public class PessoaJuridica extends Cliente{

	String cnpj;
	
	public PessoaJuridica(String nome, int idade, int cartao, int numeroTelefone, String email,String cnpj) {
		super(nome, idade, cartao, numeroTelefone, email);
		this.cnpj = cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O CNPJ do Cliente é: " + cnpj);
	}
}
