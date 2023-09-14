package br.com.poo.bancoAmbl3.contas;

//import java.util.Date;

public class Conta {
	private static int contador = 1;

	private String tipoConta;
	private String cpfTitular;
	private String titular;
	private String agencia;
	private double saldo;
	private int numeroConta;
	// private Date dataTransferencia;

	public Conta() {
		this.numeroConta = Conta.contador;
		Conta.contador++;
	}

	public Conta(double saldo, String titular) {
		this.numeroConta = Conta.contador;
		this.saldo = saldo;
		this.titular = titular;
		Conta.contador++;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		} else {
			this.saldo += valor;
			return true;

		}
	}

	public boolean sacar(double valor) {
		if (valor > this.saldo || valor <= 0) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public void imprimirExtrato() {
		
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", numeroConta=" + numeroConta + "]";
	}

}
