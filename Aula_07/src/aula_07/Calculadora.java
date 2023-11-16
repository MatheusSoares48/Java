package aula_07;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int numero1,numero2,opção;
		
		while(true) {
		
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Sair");
		System.out.println("Qual operação matematica voce deseja realizar ?");
		opção = leia.nextInt();
		
		if(opção == 0) {
			sobre();
			System.exit(0);
		}
		
		System.out.println("Digite o primeiro numero");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero");
		numero2 = leia.nextInt();
		
		switch(opção){
			case 1 -> System.out.println("Soma: "+ somar(numero1,numero2));
			case 2 -> System.out.println("Subtração: "+ subtrair(numero1,numero2));
			case 3 -> System.out.println("Multiplicação: "+ multiplicar(numero1,numero2));
			case 4 -> System.out.println("Divisão: "+ dividir(numero1,numero2));
			default -> System.out.println("Opção invalida!");
		}		
		
	}
		
}
	//usar mesmos nomes mas diferentes tipos.
	// se chama sobrecarga de moetodo.
	static int somar(int numero1, int numero2){
		return numero1 + numero2;
	}
	static float somar(float numero1, float numero2){ 
		return numero1 + numero2;
	}
	static int subtrair(int numero1, int numero2){
		return numero1 - numero2;
	}
	static int multiplicar(int numero1, int numero2){
		return numero1 * numero2;
	}
	static int dividir(int numero1, int numero2){
		return numero1 / numero2;
	}
	static void sobre() {
		System.out.println("Calculadora com Métodos");
		System.out.println("Feito por: Matheus");
	}
}
