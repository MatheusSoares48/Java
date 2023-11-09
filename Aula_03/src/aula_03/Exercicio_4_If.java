package aula_03;

import java.util.Scanner;

public class Exercicio_4_If {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String n1,n2,n3;
		
		System.out.println("Digite se o animal é (vertebrado/invertabrado): ");
		n1=leia.nextLine();
		System.out.println("Digite se o animal é (ave/mamifero/inseto/anelideo): ");
		n2=leia.nextLine();
		System.out.println("Digite se o animal é (carnívoro/onivoro/herbivoro/hematofago): ");
		n3=leia.nextLine();
		

			
		if (n1.equalsIgnoreCase("vertebrado"))
			if (n2.equalsIgnoreCase("ave"))
				if (n3.equalsIgnoreCase("carnívoro"))
					System.out.println("Águia");
				else
					System.out.println("Pomba");
			else
				if (n3.equalsIgnoreCase("onívoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
		else 
			if (n2.equalsIgnoreCase("inseto"))
				if (n3.equalsIgnoreCase("hematófago"))
					System.out.println("Pulga");
				else
					System.out.println("Lagarta");
			else
				if (n3.equalsIgnoreCase("hematófago"))
					System.out.println("Sanguessuga");
				else
					System.out.println("Minhoca");
	
	}

}
