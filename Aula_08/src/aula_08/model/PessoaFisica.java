package aula_08.model;

import aula_08.util.Cliente;

public class PessoaFisica extends Cliente {

	private String cpf;
	public PessoaFisica(String nome, int idade, int cartao, int numeroTelefone, String email,String cpf) {
		super(nome, idade, cartao, numeroTelefone, email);
		this.cpf = cpf;
		
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O CPF do Cliente é: " + cpf);
	}
}
