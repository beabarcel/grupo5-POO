package br.com.poo.bancoAmbl3.contas;

import java.util.Date;

public class ContaPoupanca extends Conta{
	private double rendimento = 1.1;
	private int cartaoDebito;
	private int cvv;
	private Date data;
	
	
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContaPoupanca(double saldo, String titular) {
		super(saldo, titular);
		// TODO Auto-generated constructor stub
	}
	
	
}
