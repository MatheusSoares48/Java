package aula_03;

import java.util.Scanner;

public class Exercicio_7_Switch {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float n1,n2,soma;
		int code;
		
		System.out.println("Digite o 1ª numero: ");
		n1=leia.nextFloat();
		System.out.println("Digite o 2ª numero: ");
		n2=leia.nextFloat();
		System.out.println("Agora Digite 1 p/ (+)\n"
				         + "      Digite 2 p/ (-)\n"
				         + "      Digite 3 p/ (*)\n"
				         + "      Digite 4 p/ (/)\n");
		code=leia.nextInt();
		
		switch(code) {
			case 1:
				soma=n1+n2;
				System.out.printf("%.1f + %.1f = %.1f",n1,n2,soma);
				break;
			case 2:
				soma=n1-n2;
				System.out.printf("%.1f - %.1f = %.1f",n1,n2,soma);
				break;
			case 3:
				soma=n1*n2;
				System.out.printf("%.1f * %.1f = %.1f",n1,n2,soma);
				break;
			case 4:
				soma=n1/n2;
				System.out.printf("%.1f / %.1f = %.1f",n1,n2,soma);
				break;
		}
	}

}
