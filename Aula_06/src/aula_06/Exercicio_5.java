package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_5 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();	
		
		String continua = "S",nome;
		int var;
		
		
		while(continua.equalsIgnoreCase("S")) {
		System.out.println("*******************************************\n"
				         + "\n"
				         + "      1 - Adicionar Cliente na fila   \n"
				         + "      2 - Listar todos os Clientes\n"
				         + "      3 - Chamar um Cliente da fila\n"
				         + "      0 - Sair\n"
				         + "\n"
				         + "*******************************************\n"
				         + "Digite aqui: ");
		var = leia.nextInt();
		
		System.out.println();
		
		switch(var){
			case 0:
				System.out.println("Programa Finalizado.");
				continua = "N";
				break;
			case 1:
				System.out.println("Digite o cliente a ser adicionado: ");
				leia.skip("\\R");
				fila.add(leia.nextLine());
				
				System.out.println("\nCliente adicionado na Fila\n");
				break;
				
			case 2:
				if(fila.isEmpty())
					System.out.print("\nA fila está vazia\n");
				else 
					fila.forEach(System.out::println);
				break;
			case 3:
				if(fila.isEmpty()) 
					System.out.print("\nA Fila está vazia\n");
				else 
					System.out.printf("\nCliente %s foi retirado da Fila\n",fila.poll());
				break;
			default:
				System.out.print("\nOpção Invalida!");
				break;
		
		   }
		}
	}

}
