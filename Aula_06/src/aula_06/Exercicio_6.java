package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio_6 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();	
		
		String continua = "S",nome;
		int var;
		
		
		while(continua.equalsIgnoreCase("S")) {
		System.out.println("*******************************************\n"
				         + "\n"
				         + "     1 - Adicionar um novo livro na pilha. \n"
				         + "     2 - Listar todos os Livros\n"
				         + "     3 - Retirar um livro da pilha\n"
				         + "     0 - Sair\n"
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
				System.out.println("Digite o Livro a ser adicionado: ");
				leia.skip("\\R");
				pilha.push(leia.nextLine());
				
				System.out.println("\nLivro adicionado na pilha\n");
				break;
				
			case 2:
				if(pilha.isEmpty())
					System.out.print("\nA pilha está vazia\n");
				else 
					pilha.forEach(System.out::println);
				break;
			case 3:
				if(pilha.isEmpty()) 
					System.out.print("\nA pilha está vazia\n");
				else 
					System.out.printf("\nLivro %s foi retirado da pilha\n",pilha.pop());
				break;
			default:
				System.out.print("\nOpção Invalida!");
				break;
		
		   }
		}
	}

}