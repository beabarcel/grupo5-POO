package br.com.poo.bancoAmbl3.contas;

public class ContaCorrente extends Conta {
	private double limite;
	private double chequeEspecial;
	
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
