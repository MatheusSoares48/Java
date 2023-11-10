package aula_03;

import java.util.Scanner;

public class Exercicio_5_Switch {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int code,qntd,valortotal;

		System.out.print("Agora Digite 1 p/ HotDog\n"
		         + "      Digite 2 p/ X-Salada\n"
		         + "      Digite 3 p/ X-Bacon\n"
		         + "      Digite 4 p/ Bauru\n"
		         + "      Digite 5 p/ Refrigerante\n"
		         + "      Digite 6 p/ Suco de laranja\n"
		         + "      Digite aqui: ");
		code=leia.nextInt();
		System.out.print("\nDigite a quantidade : ");
		qntd = leia.nextInt();
		
		switch(code) {
		case 1:
			valortotal=qntd*10;
			System.out.printf("\nProduto: HotDog\nValor total: %d",valortotal);
			break;
		case 2:
			valortotal=qntd*15;
			System.out.printf("\nProduto: X-Salada\nValor total: %d",valortotal);
			break;
		case 3:
			valortotal=qntd*18;
			System.out.printf("\nProduto: X-Bauru\nValor total: %d",valortotal);
			break;
		case 4:
			valortotal=qntd*12;
			System.out.printf("\nProduto: Bauru\nValor total: %d",valortotal);
			break;
		case 5:
			valortotal=qntd*8;
			System.out.printf("\nProduto: Refrigerante\nValor total: %d",valortotal);
			break;
		case 6:
			valortotal=qntd*13;
			System.out.printf("\nProduto: Suco de laranja\nValor total: %d",valortotal);
			break;
		default:
			System.out.print("\nCodigo Invalido! ");
	   }
	}

}
