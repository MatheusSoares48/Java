package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i=5; i!=0 ;i--) {
			System.out.printf("Digite 5 cores: Restam(%d) \n",i);
			cores.add(leia.nextLine());
		}
		System.out.println();
		
		for(var cor : cores)
		System.out.println(cor);
		
		System.out.println();
		
		cores.sort(null);
		
		for(var cor : cores)
			System.out.println(cor);

	}

}
