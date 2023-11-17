package aula_08;

import aula_08.util.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("UX-Designer","1º A Essência da UX 2º Jornada do Usuário"
		+ "\n3ª Prototipagem e Design Iterativo 4º Métricas e Analytics,etc","Jonathan Santos - Thais Mendes",2.50f,"SENAC.com.br\n");
		c1.visualizar();
		
		Curso c2 = new Curso("Desenvolvimento de Sistemas","1º Logica 2º POO"
		+ " 3º API 4º Testes Unitarios,etc","Rafael Rodrigues - Tati Ribeiro",0.6f,"Generation.com.br\n");
		c2.visualizar();
	}

}
