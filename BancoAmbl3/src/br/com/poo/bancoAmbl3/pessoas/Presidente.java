package br.com.poo.bancoAmbl3.pessoas;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.contas.Conta;
import br.com.poo.bancoAmbl3.contas.ContaCorrente;
import br.com.poo.bancoAmbl3.contas.ContaPoupanca;
import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

public class Presidente extends Funcionario implements FolhaDePagamento {

	double totalCapital = 0;

	public Presidente(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);
	}

	public Presidente() {

	}

	public double relatorioCapital() throws IOException {

		Map<String, ContaCorrente> CC = new ContaCorrente().buscarCC();
		Map<String, ContaPoupanca> CP = new ContaPoupanca().buscarCP();

		for (Conta cc : CC.values()) {
			this.totalCapital += cc.getSaldo();
		}
		for (Conta cp : CP.values()) {
			this.totalCapital += cp.getSaldo();
		}
		return totalCapital;
	}

	public void relatorioDiretores() throws IOException {

		Map<String, Diretor> diretor = new Diretor().buscarDiretor();

		String path = "Diretor";
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true));
		buffWrite.append(" Relatório \n");
		for (Diretor d : diretor.values()) {

			buffWrite.append("Nome: " + d.getNome() + "\n");
			/*
			 * buffWrite.append("Conta: " + getNumeroConta() + "\n");
			 * buffWrite.append("Valor do Saque: " + valor + "\n");
			 * buffWrite.append(" FIM SAQUE \n");
			 */
		}
		buffWrite.close();
	}

	public Map<String, Presidente> buscarPresidente() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.PRESIDENTE);
		Map<String, Presidente> presidente = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			presidente.put(linha.split(",")[2], new Presidente(linha.split(",")[1], linha.split(",")[2],
					linha.split(",")[3], linha.split(",")[4], linha.split(",")[5]));
		}
		return presidente;

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
		return this.getSalario() * 0.25;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public double getTotalCapital() {
		return totalCapital;
	}

	public void setTotalCapital(double totalCapital) {
		this.totalCapital = totalCapital;
	}

}
