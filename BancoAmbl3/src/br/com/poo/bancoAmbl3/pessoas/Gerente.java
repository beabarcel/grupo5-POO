package br.com.poo.bancoAmbl3.pessoas;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

	public void relatorioTotalContas() {

	}

	public void relatorioContas() {

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
		return this.getSalario()*0.15;
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