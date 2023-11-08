package Aula_02;

import java.util.Scanner;

public class Exercicio_4 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float n1,n2,n3,n4,diferença;
		
		System.out.println("Digite o Produto 1 ");
		n1=leia.nextFloat();
		System.out.println("Digite o Produto 2 ");
		n2=leia.nextFloat();
		System.out.println("Digite o Produto 3 ");
		n3=leia.nextFloat();
		System.out.println("Digite o Produto 4 ");
		n4=leia.nextFloat();
		
		diferença=(n1*n2)-(n3*n4);
		System.out.println("A diferença entre os produtos N1 e N2 entre os produtos N3 e N4 é "+diferença);
	}

}
