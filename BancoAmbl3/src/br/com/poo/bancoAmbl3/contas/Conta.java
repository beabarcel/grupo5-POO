package br.com.poo.bancoAmbl3.contas;

public class Conta {
	private double saldo;
	private String titular;
	private int numeroConta;
	
	public Conta() {
	}
	
	public Conta(double saldo, String titular, int numeroConta) {
		this.saldo = saldo;
		this.titular = titular;
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
}
