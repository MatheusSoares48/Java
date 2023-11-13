package aula_05;

import java.util.Scanner;

public class Exercicio_2 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10], pares = new int[10], impares = new int[10];
		int soma = 0;
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Escreva um numero: ");
			vetor[i] = leia.nextInt();
			soma+=vetor[i];	
			
			if(vetor[i]%2==0) {
				pares[i] = vetor[i];
			}
			else {
				impares[i]=vetor[i];
			}
		}
		System.out.println("Elementos nos índices impares: ");
		for(int var : impares) {
			if(var !=0) {
				System.out.println(var);
			}
		}
		System.out.println("Elementos nos índices pares: ");
		for(int var1 : pares) {
			if(var1 !=0) {
				System.out.println(var1);
			}
		}
		float media = (float)soma/10;
		System.out.println("Soma: "+soma);
		System.out.printf("Media: %.2f",media);
	}
}
