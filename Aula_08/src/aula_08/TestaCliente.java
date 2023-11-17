package aula_08;

import aula_08.util.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Matheus",12,"SA-SP",975181322,"saopaulo.08@yahoo.com\n");
		c1.visualizar();
		
		Cliente c2 = new Cliente("Felipe",12,"UB-MG",998390271,"joaokleber_@yahoo.com\n");
		c2.visualizar();
		
		c1.setIdade(23);
		c1.visualizar();
		System.out.println(c1.getNumeroTelefone()-1);
	}

}
