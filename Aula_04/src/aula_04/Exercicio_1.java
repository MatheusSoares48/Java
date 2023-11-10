package aula_04;

import java.util.Scanner;

public class Exercicio_1 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n1,n2;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for(n1 = n1; n1 <= n2; n1++) {
				if(n1%3==0 && n1%5==0) {
					System.out.println(n1+" é multiplo de 3 e 5");
				}
			}
		}
		else
			System.out.println("Intervalo Invalido ");
	}

}
