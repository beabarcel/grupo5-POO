package br.com.poo.bancoAmbl3;

import java.io.IOException;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.pessoas.Presidente;

public class SistemaInterno {

	public static void main(String[] args) {
		
		Presidente p = new Presidente("Daniel", "098777654321", "daniela@gmail.com", "24992234566");
		try {
			Presidente.criarPresidente(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Conta c1 = new Conta(1000.0,"Marcos");
		c1.depositar(50.0);
		c1.sacar(100.0);
		
		Conta c2 = new Conta();
		c2.depositar(50.0);
		c2.sacar(100.0);*/
	}

}
