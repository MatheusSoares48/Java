package Aula_02;

import java.util.Scanner;

public class Exercicio_1 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float salario,abono,SalarioNovo;
		
		System.out.println("Digite o salario ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono ");
		abono = leia.nextFloat();
		
		SalarioNovo=salario+abono;
		System.out.println("Seu novo salario é igual a "+ SalarioNovo);
	}

}
