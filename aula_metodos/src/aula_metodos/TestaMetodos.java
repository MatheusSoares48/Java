package aula_metodos;

public class TestaMetodos {

	public static void main(String[] args) {
		
		// Chamadas para os Métodos Locais
		
		metodoPublico();
		metodoFriendly();	
		metodoProtegido();
		metodoPrivado();
		
	}

	public static void metodoPublico() {
		System.out.println("Metodo Público");
	}
	
	public static void metodoFriendly() {
		System.out.println("Metodo Friendly");
	}
	public static void metodoProtegido() {
		System.out.println("Metodo Protegido");
	}
	public static void metodoPrivado() {
		System.out.println("Metodo Privado");
	}
}
