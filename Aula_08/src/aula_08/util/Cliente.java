package aula_08.util;

public class Cliente {

	private String nome;
	private int idade;
	private String endereço;
	private int numeroTelefone ;
	private String email;
	
	public Cliente(String nome, int idade, String endereço, int numeroTelefone, String email) {
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	public void visualizar() {
		
		System.out.println("****************************");
		System.out.println("Dados do Cliente");
		System.out.println("****************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Idade do Cliente: " + this.idade);
		System.out.println("Endereço do Cliente: " + this.endereço);
		System.out.println("Numero do Cliente: " + this.numeroTelefone);
		System.out.println("Email do Cliente: " + this.email);
		
		
	}
		
	
}
