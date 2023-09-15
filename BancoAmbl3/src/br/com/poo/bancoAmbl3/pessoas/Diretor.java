package br.com.poo.bancoAmbl3.pessoas;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import br.com.poo.bancoAmbl3.enums.TipoRegistro;
import br.com.poo.bancoAmbl3.io.LeituraEscrita;

public class Diretor extends Funcionario {

	int[] agencias;

	public Diretor(String nome, String cpf, String email, String telefone, String senha) {
		super(nome, cpf, email, telefone, senha);

	}

	public Diretor() {
		super();
	}

	public void relatorio() {
		
	}

	public int[] getAgencias() {
		return agencias;
	}

	public void setAgencias(int[] agencias) {
		this.agencias = agencias;
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
		return this.getSalario() * 0.20;
	}

	@Override
	public String toString() {
		return "\nDiretor [agencias=" + Arrays.toString(agencias) + ", getNome()=" + getNome() + ", getCpf()=" + getCpf()
				+ ", getEmail()=" + getEmail() + ", getTelefone()=" + getTelefone() + ", getCargo()=" + getCargo()
				+ "]";
	}

	public Map<String, Diretor> buscarDiretor() throws IOException {
		Map<String, String> registros = LeituraEscrita.leitor(TipoRegistro.DIRETOR);
		Map<String, Diretor> diretor = new HashMap<>();
		for (String registro : registros.keySet()) {
			String linha = registros.get(registro);
			diretor.put(linha.split(",")[1], new Diretor(linha.split(",")[1], linha.split(",")[2], linha.split(",")[3],
					linha.split(",")[4], linha.split(",")[5]));

		}
		return diretor;

	}
}
