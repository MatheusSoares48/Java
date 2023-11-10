package aula_04;

import java.util.Scanner;

public class Exercicio_5 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n1,soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			n1=leia.nextInt();
			
			if(n1 > 0)
				soma=n1+soma;
			
		}while(n1!=0);
		
		System.out.println("A soma dos numeros positivos é: "+soma);

	}

}
