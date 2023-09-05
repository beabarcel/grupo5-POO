package br.com.poo.bancoAmbl3.contas;

import java.util.logging.Level;

public class ContaCorrente extends Conta {
	public ContaCorrente(double saldo, String titular){

		super(saldo, titular);
	}
	
	private double limite;
	
}
