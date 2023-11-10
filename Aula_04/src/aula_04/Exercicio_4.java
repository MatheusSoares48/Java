package aula_04;

import java.util.Scanner;

public class Exercicio_4 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade,gen,dev,codeGen,code,BackEnd = 0,TCF = 0,MCisFront= 0,MTransFront=0,HCisMob=0,HTransMob=0,TCB=0,NBinarFTMenor=0,cont=0;
		String continua = "S";
		float media,soma=0;

		while (continua.equalsIgnoreCase("S")) {	
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
		    cont++;
		    soma=idade+soma;
		    
			System.out.println("Digite sua identidade de genero \n1-Mulher Cis\n2-Homem Cis\n3-Não Binario\n4-Mulher Trans\n5-Homem Trans\n6-Outros");
			codeGen = leia.nextInt();
		
			System.out.println("Digite qual sua função \n1-BackEnd\n2-FrontEnd\n3-Mobile\n4-Full Stack");
			code = leia.nextInt();
			if(code==1)
				BackEnd++;
			if(codeGen==1 && code==2)
				MCisFront++;
			if(codeGen==4 && code==2)
				MTransFront++;
			if((MCisFront > 0 || MTransFront > 0) && (codeGen==1 || codeGen==4) && code==2)
				TCF++;
			//Fiz desse modo para garantir que mesmo se responder em ordens diferentes irá chegar no mesmo resultado.
			//ex: Mulher trans e depois mulher cis de front.
			if(codeGen==2 && code==3)
				HCisMob++;
			if(codeGen==5 && code==3)
				HTransMob++;
			if(HCisMob > 0 || HTransMob > 0 && codeGen==1 && code==2)
				TCB++;
			if(codeGen == 3 && code == 4 && idade < 30)
				NBinarFTMenor++;
			
			System.out.println("Voce quer continuar?(S)/(N): ");
			leia.skip("\\R");
			continua = leia.nextLine();
			
		}
		media=soma/cont;
		System.out.println("Total de pessoas DevBackEnd "+BackEnd);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+TCF);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+TCB);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+NBinarFTMenor);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+cont);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f",media);
	}

}
