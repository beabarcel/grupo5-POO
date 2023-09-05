package br.com.poo.bancoAmbl3.contas;

import java.util.logging.Level;

public class ContaCorrente extends Conta {
	private double limite;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(double saldo, String titular){
		super(saldo, titular);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
