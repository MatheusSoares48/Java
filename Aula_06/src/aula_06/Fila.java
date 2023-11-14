package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		//Remove o primeiro que foi adicionado

		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		//Mostra o primeiro elemento
		System.out.println(fila.peek());
		
		System.out.println(fila);
		//Retira o primeiro elemento
		System.out.println(fila.poll());
		
		System.out.println(fila);

		System.out.println("A Maria está na fila?: " + fila.contains("Maria"));	
		
		System.out.println("Numero de elementos na fila: " + fila.size());
		
		int contador = 0;
		
		//Fala a posição do elemento na fila
		for(var pessoa : fila) {
			contador++;
			if(pessoa.equalsIgnoreCase("Maria")) 
				System.out.println("Posição: " + contador);
			
		}
	}

}
