package aula_08.model;

import aula_08.util.Curso;

public class CursoLivre extends Curso{

	private String patriocinio;
	
	public CursoLivre(String nome, String conteudo, String professores, float duração, String site,String patriocinio) {
		super(nome, conteudo, professores, duração, site);
		this.patriocinio = patriocinio;
	}

	public String getPatriocinio() {
		return patriocinio;
	}

	public void setPatriocinio(String patriocinio) {
		this.patriocinio = patriocinio;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("* Curso Patriocinado por: " + patriocinio);
	}

}
