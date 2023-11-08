package Aula_02;

import java.util.Scanner;

public class Exercicio_3 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float salariobruto,adicionalnoturno,horasextras,descontos,salarioliquido;
		
		System.out.println("Digite o Salario Bruto ");
		salariobruto=leia.nextFloat();
		System.out.println("Digite o Adicional Noturno ");
		adicionalnoturno=leia.nextFloat();
		System.out.println("Digite as Horas Extras ");
		horasextras=leia.nextFloat();
		System.out.println("Digite os Descontos ");
		descontos=leia.nextFloat();
		
		salarioliquido=salariobruto+adicionalnoturno+(horasextras*5)-descontos;
		System.out.println("O Salario Liquido é igual a "+salarioliquido);

	}

}
