package aula_08.model;

import aula_08.util.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Matheus",12,2,975181322,"saopaulo.08@yahoo.com\n");
		c1.visualizar();
		
		Cliente c2 = new Cliente("Felipe",12,1,998390271,"joaokleber_@yahoo.com\n");
		c2.visualizar();
		
		c1.setIdade(23);
		c1.visualizar();
		
		PessoaFisica cc1 = new PessoaFisica("Robson",90,2,975181322,"botafogo.08@yahoo.com","128.621.798/16");
		cc1.visualizar();
		
		PessoaFisica cc2 = new PessoaFisica("Joel",23,1,972343243,"JõaoDias.09@yahoo.com","323.435.235/15");
		cc2.visualizar();
		
		PessoaJuridica cd1 = new PessoaJuridica("Thomas",25,2,972343243,"JõaoDias.09@yahoo.com","12.345.678/0001-00");
		cd1.visualizar();
		
		PessoaJuridica cd2 = new PessoaJuridica("Joel",78,1,972114243,"JõaoDias.09@yahoo.com","21.234.568/0001-00");
		cd2.visualizar();
	}

}
