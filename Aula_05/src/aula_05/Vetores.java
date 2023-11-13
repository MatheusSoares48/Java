package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String pessoas[] = {"Luiza","Aline","Vinicius","Antõnio","Vitor","Samara"};
		float[] notas = new float[5];
		
		for(int indice=0;indice < 6;indice++) {
		System.out.println("Posição "+ (indice + 1) + " = " + pessoas[indice]);
		}
		
		System.out.println("");
		
		/*for(int indice=0;indice < 5;indice++) {
			System.out.println("Digite valor para a posição ["+ indice + "]: ");
			notas[indice] = leia.nextFloat();
			
		}
		
		for(int indice=0;indice < notas.length ;indice++) {
			System.out.println("Posição " + " = " + notas[indice]);
		}*/
		
		Arrays.sort(pessoas);
		
		System.out.println("");
		
		for(int indice=0;indice < pessoas.length ;indice++) {
			System.out.println("posição ["+ indice + "]: "+ pessoas[indice]);
		}
		for(int indice = pessoas.length -1 ;indice >= 0 ;indice--) {
			System.out.println("posição ["+ indice + "]: "+ pessoas[indice]);
		}
		
		System.out.println("");
		
		System.out.println("a posição do elemento aline é " + Arrays.binarySearch(pessoas, "Aline"));
		//se voce colocar algo que não tem no vetor, vai mostrar um numero negativo
		
		Arrays.binarySearch(pessoas, "Kenthal");
		if(Arrays.binarySearch(pessoas, "Kenthal") < 0)
			System.out.println("Valor não encontrado");
		
		for(int indice=0;indice < pessoas.length ;indice++) {
			if (pessoas[indice].equalsIgnoreCase("Aline"))
				System.out.println("Aline está na posição :" + indice);
		}
		
		//percorre todo o array, e cada variavel que ele encontrar ele vai salvar na variabel pessoa 	
		for(String pessoa : pessoas) { // ":" percorre o array do começo ao fim.
			System.out.println(pessoa);
		//para cada pessoa em pessoas, execute o codigo dentro das chaves
		}
	}

}
