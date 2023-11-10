package aula_03;

import java.util.Scanner;

public class Exercicio_2_If {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int n1;
		
		System.out.println("Digite um numero: ");
		n1=leia.nextInt();
		
		if(n1%2==0) 
			if(n1>=0)
				System.out.println("O numero é par e positivo! ");
			else
				System.out.println("O numero é par e negativo! ");
		else
			if(n1>=0)
				System.out.println("O numero é impar e positivo! ");
			else
				System.out.println("O numero é impar e negativo! ");
					
	}

}
