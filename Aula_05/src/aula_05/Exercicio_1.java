package aula_05;

import java.util.Scanner;

public class Exercicio_1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		int var;
		boolean valor = false;
		
		System.out.println("Selecione o numero que voce quer encontrar no vetor = {2,5,1,3,4,9,7,8,10,6} ");
		var = leia.nextInt();
		leia.skip("\\R");
		
		for(int i=0;i<vetor.length;i++){
			if(var == vetor[i]){
				valor = true;
				System.out.printf("O numero %d está na posição %d",var,i);
			}
		}
		if(valor == false) {
			System.out.println("Valor não encontrado!");
		}
	}
}

