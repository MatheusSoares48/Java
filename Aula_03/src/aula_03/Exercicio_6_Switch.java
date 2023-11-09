package aula_03;

import java.util.Scanner;

public class Exercicio_6_Switch {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nome;
		int code;
		float salario,soma; 
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Digite seu codigo (1 a 6):  ");
		code = leia.nextInt();
		System.out.print("Digite seu salario: ");
		salario = leia.nextFloat();	
		
		switch(code){
		case 1:
			soma=(salario/10);
			salario=(soma+salario);
			System.out.printf("Nome do colaborador: %s\n"
					+ "Cargo: Gerente\n"
					+ "Salario: %.0f",nome,salario);
			break;
		case 2:
			soma=(salario/7);
			salario=(soma+salario);
			System.out.printf("Nome do colaborador: %s\n"
					+ "Cargo: Vendedor\n"
					+ "Salario: %.0f",nome,salario);
			break;
		case 3:
			soma=(salario/9);
			salario=(soma+salario);
			System.out.printf("Nome do colaborador: %s\n"
					+ "Cargo: Supervisor\n"
					+ "Salario: %.0f",nome,salario);
			break;
		case 4:
			soma=(salario/6);
			salario=(soma+salario);
			System.out.printf("Nome do colaborador: %s\n"
					+ "Cargo: Motorista\n"
					+ "Salario: %.0f",nome,salario);
			break;
		case 5:
			soma=(salario/5);
			salario=(soma+salario);
			System.out.printf("Nome do colaborador: %s\n"
					+ "Cargo: Estoquista\n"
					+ "Salario: %.0f",nome,salario);
			break;
		case 6:
			soma=(salario/8);
			salario=(soma+salario);
			System.out.printf("Nome do colaborador: %s\n"
					+ "Cargo: Tecnico de TI\n"
					+ "Salario: %.0f",nome,salario);
			break;
		default:
			System.out.println("Faixa Etaria Invalida! ");
		}
		
	}

}
