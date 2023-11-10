package aula_03;

import java.util.Scanner;

public class Exercicio_3_If {


	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nome,var;
		int idade;
		boolean resp;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.print("\nÉ sua primeira doação ? (s/n): ");
		leia.skip("\\R");	
		var = leia.nextLine();
		
		if(var.equalsIgnoreCase("s")) {
			resp = true;
		}
		else {
	    	resp = false;
		}
		
			if(idade >= 18 && idade <=60 || idade > 60 && idade <= 69 && resp == false) {
				System.out.printf("\n%s está apto(a) para doar sangue! ",nome);
		}
			else
				System.out.printf("\n%s não está apto(a) para doar sangue. ",nome);
	

	}

}
