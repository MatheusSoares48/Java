package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i=10; i!=0 ;i--) {
			System.out.printf("Digite 10 numeros inteiros não repetidos: Restam(%d) \n",i);
			numeros.add(leia.nextInt());
		}
		
		ArrayList<Integer> number = new ArrayList<Integer>(numeros);
		number.sort(null);
		
		System.out.println();
		
		Iterator<Integer> iNumeros = number.iterator();
		
		System.out.println();
		
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());
	
	}
}
