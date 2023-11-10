package aula_04;

import java.util.Scanner;

public class TabuadaV2 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int num, cont = 1;
		
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
		
			while(cont <= 10) {
				System.out.println(num+" X "+cont+" = " + (num * cont));
				cont++;	
			}

		

	}

}
