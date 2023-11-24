package aula_09;

public class Gerente extends Funcionario implements CalcularSalario{

	private float bonus;
	public Gerente(String nome, int cargo, float salario,float bonus) {
		super(nome, cargo, salario);
		this.bonus = bonus;
	}
	public float getComissao() {
		return bonus;
	}
	public void setComissao(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Comissão: " + this.bonus);
	}
	
	// Implementação do método abstrato na subclasse
	@Override
	public float calcularSalario() {
		return this.getSalario() + this.bonus;

	}
}
