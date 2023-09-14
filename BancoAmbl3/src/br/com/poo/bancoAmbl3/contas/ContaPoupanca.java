package br.com.poo.bancoAmbl3.contas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

public class ContaPoupanca extends Conta {

	private double rendimento;
	private double taxa = 0.15;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(double saldo, String titular) {
		super(saldo, titular);
	}
	
	public ContaPoupanca(String cpfTitular, String titular, String agencia, double saldo,
			int numeroConta) {
		super(cpfTitular, titular, agencia, saldo, numeroConta);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	@Override
	public boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		} else {
			setSaldo(getSaldo() + valor);
			return true;

		}
	}
	
	@Override
	public boolean sacar(double valor) {
		if (valor > getSaldo() || valor <= 0) {
			return false;
		} else {
			setSaldo(getSaldo() - valor);
			return true;
		}
	}
	
	public double relatorioRendimento(int dias, double valor) {
		double meses = dias / 30.44;
		this.rendimento = valor * taxa * meses;
		return rendimento;
	}
	
	@Override
	public String toString() {
		return "\nContaPoupanca " + " CPF do Titular= " + getCpfTitular()
				+ "Titular= " + getTitular() + ", Agencia()=" + getAgencia() + ", Saldo= " + getSaldo()
				+ ", getAgencia()=" + getAgencia() + "Numero da Conta"
				+ getNumeroConta() + "]";
	}

	public static Map<String, ContaPoupanca> buscarCP() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.CONTAPOUPANCA);
		Map<String, ContaPoupanca> CP = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			CP.put(linha.split(",")[1],
					new ContaPoupanca(linha.split(",")[1], linha.split(",")[2],
							linha.split(",")[3], Double.parseDouble(linha.split(",")[4]),
							Integer.parseInt(linha.split(",")[5])));
		}

		return CP;

	}

}
