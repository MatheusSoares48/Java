package aula_04;

import java.util.Scanner;

public class Exercicio_6 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	int n1,cont = 0;
	float media,soma=0;
			
			do {
				System.out.print("\nDigite um numero: ");
				n1=leia.nextInt();
				
				if(n1 % 3 == 0 && n1 != 0) {
					soma=n1+soma;
					cont++;
				}
			}while(n1!=0);
			
			media=soma/cont;
			System.out.println("A média de todos os numeros multiplos de 3 é: "+media);

	}

}
