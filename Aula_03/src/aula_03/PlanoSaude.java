package aula_03;

import java.util.Scanner;

public class PlanoSaude {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome=leia.nextLine();
		System.out.print("\nDigite a sua idade: ");
		idade=leia.nextInt();
		
		if(idade > 0 && idade <= 10){
			System.out.printf("\nOlá %s O seu plano de Saude custará 100$ /mes",nome);
		}
		else if(idade > 11 && idade <= 29){
			System.out.printf("\nOlá %s O seu plano de Saude custará 200$ /mes",nome);
		}
		else if(idade > 30 && idade <= 45){
			System.out.printf("\nOlá %s O seu plano de Saude custará 300$ /mes",nome);
		}
		else if(idade > 46 && idade <= 59){
			System.out.printf("\nOlá %s O seu plano de Saude custará 500$ /mes",nome);
		}
		else if(idade > 60 && idade <= 65){
			System.out.printf("\nOlá %s O seu plano de Saude custará 600$ /mes",nome);
		}
		else{
			System.out.printf("\nOlá %s O seu plano de Saude custará 1000$ /mes",nome);
		}
		
	}
}
