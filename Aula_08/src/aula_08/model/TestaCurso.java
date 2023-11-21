package aula_08.model;

import aula_08.util.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("UX-Designer","1º A Essência da UX 2º Jornada do Usuário"
		+ "\n3ª Prototipagem e Design Iterativo 4º Métricas e Analytics,etc","Jonathan Santos - Thais Mendes",2.50f,"SENAC.com.br\n");
		c1.visualizar();
		
		Curso c2 = new Curso("Desenvolvimento de Sistemas","1º Logica 2º POO"
		+ " 3º API 4º Testes Unitarios,etc","Rafael Rodrigues - Tati Ribeiro",0.6f,"Generation.com.br\n");
		c2.visualizar();
		
		Especializacao cc1 = new Especializacao("Psicologia Medica","1º Logica Medicinal 2º Metodos"
		+ " 3º Engenharia social 4º Testes Psicotenicos,etc","Rafaela Araujo - Edu Guedes",2f,"USP",5);
		cc1.visualizar();
		
		Especializacao cc2 = new Especializacao("Mecanico Industrial","1º Logica Industrial 2º Materiais"
		+ " 3º Metodologias 4º Medição,etc","Monise Ribeiro",2f,"UNINOVE",3);
		cc2.visualizar();	
		
		CursoLivre cd1 = new CursoLivre("Informatica","1º Hardware 2º Software"
		+ " 3º Excel ","Diego Santana",0.1f,"MiniCursos","SENAI");
		cd1.visualizar();
		
		CursoLivre cd2 = new CursoLivre("Ingles Basico","1º Verb to Be 2º Gramatica"
		+ " 3º Simple Past 4º Irregular Verbs","Daiana Moura",0.2f,"Languages","ITAÚ");
		cd2.visualizar();
				
		
		
	}

}
