package aula_04;

import java.util.Scanner;

public class Exercicio_3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = 0,m21 = 0,m50 = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0)
				m21++;
			if(idade > 50)
				m50++;
				
		}
		
		System.out.println("Total de pessoas menores de 21 anos: "+m21);
		System.out.println("Total de pessoas maiores que 50 anos: "+m50);
	}

}
