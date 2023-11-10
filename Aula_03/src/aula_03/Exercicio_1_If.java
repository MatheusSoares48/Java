package aula_03;

import java.util.Scanner;

public class Exercicio_1_If {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int A,B,C,soma;
		
		System.out.println("Digite um valor A: ");
		A=leia.nextInt();
		System.out.println("Digite um valor B: ");
		B=leia.nextInt();
		System.out.println("Digite um valor C: ");
		C=leia.nextInt();
		soma=A+B;
		
		if(A+B < C){
			System.out.println("A soma de A + B é menor do que C ");
		}
		else {
			if(A+B == C){
				System.out.println("A soma de A + B é igual a C ");
			}
			else {
				System.out.println("A soma de A + B é maior do que C ");
				}
			}
		}
	}


