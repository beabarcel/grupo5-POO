package br.com.poo.bancoAmbl3;

import java.util.logging.Logger;

import br.com.poo.bancoAmbl3.contas.Conta;

public class SistemaInterno {

	public static void main(String[] args) {
		Conta c1 = new Conta(1000.0,"Marcos");
		c1.depositar(50.0);
		c1.sacar(100.0);
		
		Conta c2 = new Conta();
		c2.depositar(50.0);
		c2.sacar(100.0);
	}

}
