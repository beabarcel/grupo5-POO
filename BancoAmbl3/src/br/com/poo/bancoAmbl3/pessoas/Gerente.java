package br.com.poo.bancoAmbl3.pessoas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

public class Gerente extends Funcionario implements FolhaDePagamento {

	int agencia;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);
	}

	public void relatorioContas() throws IOException {

		Map<String, ContaCorrente> contaCorrente = new ContaCorrente().buscarCC();

		String path = "Contas";
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true));
		buffWrite.append(" Relatório de Contas\n");
		for (ContaCorrente cc : contaCorrente.values()) {

			buffWrite.append("Conta Corrente \n");

			buffWrite.append("Conta: " + cc.getNumeroConta() + "\n");
			buffWrite.append("Titular: " + cc.getTitular() + "\n");
			buffWrite.append("Saldo: " + cc.getSaldo());

		}

		Map<String, ContaPoupanca> contaPoupanca = new ContaPoupanca().buscarCP();

		for (ContaPoupanca cp : contaPoupanca.values()) {

			buffWrite.append("Conta Poupança \n");

			buffWrite.append("Conta: " + cp.getNumeroConta() + "\n");
			buffWrite.append("Titular: " + cp.getTitular() + "\n");
			buffWrite.append("Saldo: " + cp.getSaldo());

		}
		buffWrite.close();
	}

	public int relatorioTotalContas() throws IOException {

		int c1 = 0;

		Map<String, ContaCorrente> contaCorrente = new ContaCorrente().buscarCC();

		for (ContaCorrente cc : contaCorrente.values()) {
			c1++;
		}

		Map<String, ContaPoupanca> contaPoupanca = new ContaPoupanca().buscarCP();

		for (ContaPoupanca cp : contaPoupanca.values()) {
			c1++;
		}
		return c1;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public double getSalario() {
		return getSalario();
	}

	@Override
	public double folhaDePagamento() {
		return this.getSalario() + this.bonificacao();
	}

	@Override
	public double bonificacao() {
		return this.getSalario() * 0.15;
	}

	public Map<String, Gerente> buscarGerente() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.GERENTE);
		Map<String, Gerente> gerentes = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			gerentes.put(linha.split(",")[2], new Gerente(linha.split(",")[1], linha.split(",")[2], linha.split(",")[3],
					linha.split(",")[4], linha.split(",")[5]));

		}
		return gerentes;
	}

	@Override
	public String toString() {
		return "\nGerente [Nome()=" + getNome() + ", getCpf()=" + getCpf() + ", getEmail()=" + getEmail()
				+ ", getTelefone()=" + getTelefone() + ", getSenha()=" + getSenha() + "]";
	}

}