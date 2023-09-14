package br.com.poo.bancoAmbl3.contas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;
import br.com.poo.bancoAmbl3.pessoas.Cliente;

public class ContaCorrente extends Conta {
	private boolean status;
	private double chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(double saldo, String titular) {
		super(saldo, titular);
	}
	public ContaCorrente(String tipoConta, String cpfTitular, String titular, String agencia, double saldo, int numeroConta) {
		super(tipoConta, cpfTitular,titular,agencia,saldo,numeroConta);
	}

	public boolean getStatus() {
		return status;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean sacarEspecial(double valor) {
		if (status && valor <= chequeEspecial) {
			setSaldo(getSaldo() - valor);
			setChequeEspecial(getChequeEspecial() - valor);
			return true;
		} else {
			setStatus(false);
			return false;
		}
	}

	public boolean pagarCheque(double valor) {
		if (this.getSaldo() < 0) {
			setSaldo(this.getSaldo() + valor);
			setChequeEspecial(getChequeEspecial() + valor);
			setStatus(true);
			return true;
		} else {
			return false;
		}
	}
	
	public void relatorioTributacao() {
		
	}
	
	
		@Override
	public String toString() {
		return "\nContaCorrente " + ",Tipo da Conta = " + getTipoConta() + "CPF do Titular= " + getCpfTitular() + "Titular= " + getTitular() + 
				", Agencia()=" + getAgencia() + ", Saldo= " + getSaldo() + ", getAgencia()=" + getAgencia() + ", getTipoConta()=" + getTipoConta()+ "Numero da Conta"+ getNumeroConta()+  "]";
	}

		public Map<String, ContaCorrente> buscarCC() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.CONTACORRENTE);
		Map<String, ContaCorrente> CC = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			CC.put(linha.split(",")[2], 
					new ContaCorrente(linha.split(",")[1],
					linha.split(",")[2],
					linha.split(",")[3],
					linha.split(",")[4],
					Double.parseDouble(linha.split(",")[5]),
					Integer.parseInt(linha.split(",")[6])));
		}
		
		return CC;
		
	}
}

