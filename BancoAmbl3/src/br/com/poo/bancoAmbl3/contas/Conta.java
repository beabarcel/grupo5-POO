package br.com.poo.bancoAmbl3.contas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.StatusAnalise;
import br.com.poo.bancoAmbl3.enums.TipoConta;
import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

//import java.util.Date;

public abstract class Conta {
	private static int contador = 1;
	
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
	
	public Conta(String titular, String cpfTitular) {
		this.numeroConta = Conta.contador;
		Conta.contador++;
	}
	
	public Conta(double saldo) {
		this.numeroConta = Conta.contador;
		this.saldo = saldo;
		Conta.contador++;
	}

	public Conta(double saldo, String titular) {
		this.numeroConta = Conta.contador;
		this.saldo = saldo;
		this.titular = titular;
		Conta.contador++;
	}
	
	public Conta(String cpfTitular, String titular, String agencia, double saldo, int numeroConta) {
		super();
		this.cpfTitular = cpfTitular;
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}
	
	public Conta(String cpfTitular, String titular, String agencia) {
		this.cpfTitular = cpfTitular;
		this.titular = titular;
		this.agencia = agencia;
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
	
    public abstract boolean depositar(double valor);
    
    public abstract boolean sacar(double valor);
    
    public abstract boolean transferir(Conta destino, double valor);
		
    public abstract boolean relatorioSaldo(double valor);
	
	public void imprimirExtrato() {
		
	}
	
	/*public Conta buscarSaldo(Double saldo) throws IOException {
        Map<String, Conta> conta = buscarContas();
        return  Conta.buscarContas().get(saldo);
	}*/

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", titular=" + titular + ", numeroConta=" + numeroConta + "]";
	}
}
