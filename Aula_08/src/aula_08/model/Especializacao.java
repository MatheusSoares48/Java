package aula_08.model;

import aula_08.util.Curso;

public class Especializacao extends Curso {

	private int MEC;
	
	public Especializacao(String nome, String conteudo, String professores, float duração, String site,int MEC) {
		super(nome, conteudo, professores, duração, site);
		this.MEC = MEC;
	}

	public int getMEC() {
		return MEC;
	}

	public void setMEC(int mEC) {
		MEC = mEC;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("* Nota MEC do Curso: " + this.MEC);
	}
}
