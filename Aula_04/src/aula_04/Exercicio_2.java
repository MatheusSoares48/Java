package aula_04;

import java.util.Scanner;

public class Exercicio_2 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n1,par = 0,impar = 0;
		
		for(int cont = 1; cont <=10; cont++) {
			System.out.println("Digite o "+cont+"º numero: ");
			n1 = leia.nextInt();
			if(n1 % 2==0)
				par++;
			else
				impar++;
		}
		System.out.println("Total de numeros Pares: " + par);
		System.out.println("Total de numeros Impares: " + impar);
		
	}
	
}


