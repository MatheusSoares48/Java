package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_4 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
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
			System.out.printf("O elemento %d foi encontrado! ",var);
		else
			System.out.printf("O elemento %d não foi encontrado! ",var);
	}

}
