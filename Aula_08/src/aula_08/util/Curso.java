package aula_08.util;

public class Curso {

	private String nome;
	private String conteudo;
	private String professores;
	private float duração ;
	private String site ;
	
	public Curso(String nome, String conteudo, String professores, float duração, String site) {
		this.nome = nome;
		this.conteudo = conteudo;
		this.professores = professores;
		this.duração = duração;
		this.site = site;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getProfessores() {
		return professores;
	}

	public void setProfessores(String professores) {
		this.professores = professores;
	}

	public float getDuração() {
		return duração;
	}

	public void setDuração(float duração) {
		this.duração = duração;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	public void visualizar() {
		
		System.out.println("****************************");
		System.out.println("Dados do Curso");
		System.out.println("****************************");
		System.out.println("* Nome do Curso: " + this.nome);
		System.out.println("* Conteúdo do Curso: " + this.conteudo);
		System.out.println("* Professores do Curso: " + this.professores);
		System.out.println("* Duração do Curso: " + this.duração + " Anos");
		System.out.println("* Curso disponivel em: " + this.site);
		
	}
	
}
