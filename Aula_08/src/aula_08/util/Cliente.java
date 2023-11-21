package aula_08.util;

public class Cliente {

	private String nome;
	private int idade;
	private int cartao;
	private int numeroTelefone ;
	private String email;
	
	public Cliente(String nome, int idade, int cartao, int numeroTelefone, String email) {
		this.nome = nome;
		this.idade = idade;
		this.cartao = cartao;
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

	public int getcartao() {
		return cartao;
	}

	public void setcartão(int cartao) {
		this.cartao = cartao;
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
		
		String tipo = "";
		
			switch(this.cartao) {
				case 1 -> tipo = "Tem cartão da loja";
				case 2 -> tipo = "Não tem cartão da loja";		
		}
		
		System.out.println("****************************");
		System.out.println("Dados do Cliente");
		System.out.println("****************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Idade do Cliente: " + this.idade);
		System.out.println("Cartão : " + tipo);
		System.out.println("Numero do Cliente: " + this.numeroTelefone);
		System.out.println("Email do Cliente: " + this.email);
		
		
	}
		
	
}
