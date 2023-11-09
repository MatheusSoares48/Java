package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nome;
		int FaixaEtaria;
		
		System.out.print("Digite o seu nome: ");
		nome=leia.nextLine();
		
		System.out.print("Digite o valor referente a sua idade\n"
				+ "| entre 0 a 10 Digite =  1 |"
				+ "\n| entre 11 a 29 Digite = 2 |"
				+ "\n| entre 30 a 45 Digite = 3 |"
				+ "\n| entre 46 a 59 Digite = 4 |"
				+ "\n| entre 60 a 65 Digite = 5 |"
				+ "\n| maior que 65 Digite =  6 |\n"
				+ "Digite: ");
		FaixaEtaria = leia.nextInt();
		
		switch(FaixaEtaria) {
		case 1:
			System.out.printf("\nOlá %s O seu plano de Saude custará 100$ /mes.",nome);
			break;
		case 2:
			System.out.printf("\nOlá %s O seu plano de Saude custará 200$ /mes.",nome);
			break;
		case 3:
			System.out.printf("\nOlá %s O seu plano de Saude custará 300$ /mes.",nome);
			break;
		case 4:
			System.out.printf("\nOlá %s O seu plano de Saude custará 500$ /mes.",nome);
			break;
		case 5:
			System.out.printf("\nOlá %s O seu plano de Saude custará 600$ /mes.",nome);
			break;
		case 6:
			System.out.printf("\nOlá %s O seu plano de Saude custará 1000$ /mes.",nome);
			break;
		default://else
			System.out.println("Faixa Etaria Invalida! ");
		}
		
	}
	
}
