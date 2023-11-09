package aula_02;

import java.util.Scanner;

public class Exercicio_2 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("Digite a 1º nota ");
		nota1= leia.nextFloat();
		System.out.println("Digite a 2º nota ");
		nota2= leia.nextFloat();
		System.out.println("Digite a 3º nota ");
		nota3= leia.nextFloat();
		System.out.println("Digite a 4º nota ");
		nota4= leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("Media é igual á %.1f",media);
		
	}

}
