package aula_04;

import java.util.Scanner;

public class Tabuada {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		for(int cont = 1; cont <=10; cont++) {
			System.out.println(num+" X "+cont+" = " + (num * cont));
		}

	}

}
