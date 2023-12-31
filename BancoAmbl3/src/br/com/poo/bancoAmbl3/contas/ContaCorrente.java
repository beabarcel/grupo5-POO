package br.com.poo.bancoAmbl3.contas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.StatusAnalise;
import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

public class ContaCorrente extends Conta {
	private boolean status;
	private double chequeEspecial;
	private double totalTributacao;

	public double getTotalTributacao() {
		return totalTributacao;
	}

	public void setTotalTributacao(double totalTributacao) {
		this.totalTributacao = totalTributacao;
	}

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String titular, String cpf) {
		super(titular, cpf);
	}

	public ContaCorrente(double saldo, String titular) {
		super(saldo, titular);
	}

	public ContaCorrente(String cpfTitular, String titular, String agencia, double saldo, int numeroConta) {
		super(cpfTitular, titular, agencia, saldo, numeroConta);
	}

	public ContaCorrente(String cpfTitular, String titular, String agencia) {
		super(cpfTitular, titular, agencia);
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

	@Override
	public boolean depositar(double valor) {
		if (valor <= 0.10) {
			return false;
		} else {
			setSaldo(getSaldo() + valor - 0.10);
			try {
				comprovanteDeposito(valor);
			} catch (IOException e) {
				e.printStackTrace();
			}
			totalTributacao += 0.10;
			return true;

		}
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > getSaldo() + 0.10 || valor <= 0.10) {
			return false;
		} else {
			setSaldo(getSaldo() - valor - 0.10);
			try {
				comprovanteSaque(valor);
			} catch (IOException e) {
				e.printStackTrace();
			}
			totalTributacao += 0.10;
			return true;
		}
	}

	public void comprovanteSaque(Double valor) throws IOException {
		String path = getTitular() + "_" + getCpfTitular();
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true));

		buffWrite.append("** SAQUE **\n");
		buffWrite.append("CPF: " + getCpfTitular() + "\n");
		buffWrite.append("Conta: " + getNumeroConta() + "\n");
		buffWrite.append("Valor do Saque: " + valor + "\n");
		buffWrite.append("** FIM SAQUE **\n");
		buffWrite.close();
	}

	public void comprovanteDeposito(Double valor) throws IOException {
		String path = getTitular() + "_" + getCpfTitular();
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true));

		buffWrite.append("** DEPÓSITO **\n");
		buffWrite.append("CPF: " + getCpfTitular() + "\n");
		buffWrite.append("Conta: " + getNumeroConta() + "\n");
		buffWrite.append("Valor do Depósito: " + valor + "\n");
		buffWrite.append("** FIM DEPÓSITO **\n");
		buffWrite.close();
	}

	public void comprovanteTransferencia(Conta destino, Double valor) throws IOException {
		String path = getTitular() + "_" + getCpfTitular();
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true));

		buffWrite.append("** TRANSFERÊNCIA **\n");
		buffWrite.append("CPF: " + getCpfTitular() + "\n");
		buffWrite.append("Conta Remetente: " + getNumeroConta() + "\n");
		buffWrite.append("Conta Destinatário: " + destino.getNumeroConta() + "\n");
		buffWrite.append("Valor da transferência: " + valor + "\n");
		buffWrite.append("** FIM TRANSFERÊNCIA **\n");
		buffWrite.close();
	}

	@Override
	public boolean transferir(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (!retirou) {
			return false;
		} else {
			destino.depositar(valor - 0.10);
			try {
				comprovanteTransferencia(destino, valor);
			} catch (IOException e) {
				e.printStackTrace();
			}
			totalTributacao += 0.10;
			return true;
		}
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
		return "\nCONTACORRENTE," + super.getCpfTitular() + "," + super.getTitular() + "," + super.getAgencia() + ","
				+ super.getSaldo() + "," + super.getNumeroConta();

	}

	public static Map<String, ContaCorrente> buscarCC() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.CONTACORRENTE);
		Map<String, ContaCorrente> CC = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			CC.put(linha.split(",")[1], new ContaCorrente(linha.split(",")[1], linha.split(",")[2], linha.split(",")[3],
					Double.parseDouble(linha.split(",")[4]), Integer.parseInt(linha.split(",")[5])));
		}

		return CC;

	}

	public ContaCorrente buscarContaCorrentePorCpf(String cpf) throws IOException {
		Map<String, ContaCorrente> contaCorrente = buscarCC();
		return contaCorrente.get(cpf);
	}

	@Override
	public boolean relatorioSaldo(double valor) {

		return false;

	}
}
