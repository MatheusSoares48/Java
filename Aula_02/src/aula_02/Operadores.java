package aula_02;

	import java.util.Scanner;
	
public class Operadores {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double n1,n2;
		System.out.println("Escreva o primeiro numero");
		n1 = leia.nextDouble();
		System.out.println("Escreva o segundo numero");
		n2 = leia.nextDouble();
		
		System.out.println("A Soma dos 2 numeros é "+(n1+n2));
		System.out.println("A Soma dos 2 numeros é "+(n1-n2));
		System.out.println("A Soma dos 2 numeros é "+(n1*n2));
		System.out.println("A Soma dos 2 numeros é "+(n1/n2));
		
		if (n1 != 0 || n2 != 0) {
			System.out.println("O modulo do numero 1 é (Resto da divisão)"+(n1%2));
		}else {
			System.out.println("Divisão por zero não rola amigão.");
		}
		System.out.println("A Raiz quadrada do 1 numero é "+(Math.sqrt(n1)));
		System.out.println("A Raiz quadrada do 1 numero é "+(Math.pow(n1,n2)));

	}

}
