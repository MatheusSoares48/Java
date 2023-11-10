package aula_03;

import java.util.Scanner;

public class Exercicio_8_Switch {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int code;
		float saldo=1000f,valor;
		
		System.out.print("Agora Digite 1 p/ Saldo\n"
		         + "      Digite 2 p/ Saque\n"
		         + "      Digite 3 p/ Deposito\n"
		         + "      Digite aqui: ");
		code=leia.nextInt();

		switch(code) {
		case 1:
			System.out.printf("\nVoce tem %.0f de saldo",saldo);
			break;
		case 2:
			System.out.printf("\nDigite o valor a ser sacado: ");
			valor=leia.nextFloat();
			if(valor <= saldo){
				saldo=saldo-valor;
				System.out.printf("\nSeu saldo atual é %.2f",saldo);
			}else {
				System.out.print("\nSaldo insuficiente! ");
			}
			break;
		case 3:
			System.out.print("\nDigite o valor a ser depositado: ");
			valor=leia.nextFloat();
			saldo=saldo+valor;
			System.out.printf("\nSeu saldo atual é %.2f",saldo);
			break;
		default:
			System.out.print("\nOperação Invalida! ");
		}

	}

}
