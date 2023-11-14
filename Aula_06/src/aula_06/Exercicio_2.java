package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();	
		int var;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println(numeros);
		
		System.out.println("\nDigite um numero: ");
		var = leia.nextInt();
		
		if(numeros.contains(var) == true)
			System.out.println("Seu elemento foi encontrado! E está na posição: " + numeros.indexOf(var));
		else
			System.out.printf("O elemento %d não foi encontrado! ",var);
	}

}
