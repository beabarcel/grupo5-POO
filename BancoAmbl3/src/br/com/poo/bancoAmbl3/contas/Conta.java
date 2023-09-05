package br.com.poo.bancoAmbl3.contas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conta {
	private static int contador = 1;
	
	private double saldo;
	private String titular;
	private int numeroConta;
	
	private static Logger logger = Logger.getLogger(Conta.class.getName());
	
	public Conta() {
		this.numeroConta = Conta.contador;
		Conta.contador += 1;
	}
	
	
	public Conta(double saldo, String titular) {
		this.numeroConta = this.contador;
		this.saldo = saldo;
		this.titular = titular;
		this.contador += 1;
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
	
	public boolean depositar(double valor) {
		if(valor <= 0 ) {
			logger.log(Level.INFO,"Valor inválido para deposito. ");
			return false;
		} else { 
			this.saldo += valor;
			logger.log(Level.INFO,"Depósito realizado com sucesso! ");
			logger.log(Level.INFO,"\nSaldo atualizado:{0}", getSaldo());
			return true;	
			
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > this.saldo || valor <= 0 ) {
			logger.log(Level.INFO,"Valor indisponivel para saque. ");
			return false;
		} else { 
			this.saldo -= valor;
			logger.log(Level.INFO,"Saque realizado com sucesso! ");
			logger.log(Level.INFO,"\nSaldo atualizado:{0}", getSaldo());
			return true;		
		}
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", numeroConta=" + numeroConta + "]";
	}
}
