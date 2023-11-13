package aula_05;

import java.util.Scanner;

public class Exercicio_3 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		
		for(int l=0;l < matriz.length ;l++) {
			for(int c=0;c < matriz.length ;c++) {
				System.out.println("Matriz [" + l + "][" + c + "] = " );
				matriz[l][c] = leia.nextInt();				
			}
		}
		System.out.println("Elementos da diagonal principal "+matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
		System.out.println("Elementos da diagonal secundaria "+matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][0]);
		System.out.println("Soma dos Elementos da Diagonal Principal: "+(matriz[0][0]+matriz[1][1]+matriz[2][2]));
		System.out.println("Soma dos Elementos da Diagonal Secundária: "+(matriz[2][0]+matriz[1][1]+matriz[0][2]));
		
	}

}
