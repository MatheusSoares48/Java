package aula_05;

import java.util.Scanner;

public class Exercicio_4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float[][] matriz = new float[2][4];
		float[] vetor = new float[10];
 		
		for(int l=0; l < matriz.length;l++) {
			for(int c=0;c<matriz[l].length;c++){
				System.out.println("Matriz [" + l + "][" + c + "] = " );
				matriz[l][c] = leia.nextFloat();
			}
			vetor[l]=((matriz[l][0]+matriz[l][1]+matriz[l][2]+matriz[l][3])/4);
		}
		for(int i=0; i<vetor.length;i++) {
			System.out.printf("%.1f",vetor[i]);
		}
	}

}
